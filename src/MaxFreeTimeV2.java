// https://leetcode.com/problems/reschedule-meetings-for-maximum-free-time-ii

void main() {
    System.out.println(maxFreeTime(10, new int[] { 0, 7, 9 }, new int[] { 1, 8, 10 }));

}

public int maxFreeTime(int eventTime, int[] startTime, int[] endTime) {

    int maxFreeTime = 0;

    int n = startTime.length;

    int[] gaps = new int[n + 1];

    gaps[0] = startTime[0];
    gaps[n] = eventTime - endTime[n - 1];
    for (int i = 1; i < n; i++)
        gaps[i] = startTime[i] - endTime[i - 1];

    int[] rightMaxGap = new int[gaps.length];

    for (int i = gaps.length - 2; i >= 0; i--)
        rightMaxGap[i] = Math.max(rightMaxGap[i + 1], gaps[i + 1]);

    int leftMaxGap = 0;
    for (int i = 1; i < gaps.length; i++) {
        int eventSpan = endTime[i - 1] - startTime[i - 1];

        if (eventSpan <= Math.max(leftMaxGap, rightMaxGap[i]))
            maxFreeTime = Math.max(maxFreeTime, eventSpan + gaps[i - 1] + gaps[i]);
        else
            maxFreeTime = Math.max(maxFreeTime, gaps[i - 1] + gaps[i]);

        leftMaxGap = Math.max(leftMaxGap, gaps[i - 1]);

    }

    return maxFreeTime;
}
