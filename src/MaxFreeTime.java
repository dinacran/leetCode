// https://leetcode.com/problems/reschedule-meetings-for-maximum-free-time-ii

import java.util.HashSet;

void main() {

    System.out.println(maxFreeTime(5, new int[] { 1, 3 }, new int[] { 2, 5 }));

}

public int maxFreeTime(int eventTime, int[] startTime, int[] endTime) {

    Set<Integer> gaps = new HashSet<>();

    int maxFreeTime = 0;

    for (int i = startTime[0]; i > 0; i--) {
        if (gaps.contains(i))
            break;
        gaps.add(i);
    }

    for (int i = eventTime - endTime[endTime.length - 1]; i > 0; i--) {
        if (gaps.contains(i))
            break;
        gaps.add(i);
    }


    for (int i = 1; i < endTime.length; i++) {
        for(int j = startTime[i] - endTime[i - 1]; j > 0; j--) {
            if(gaps.contains(j)) break;
            gaps.add(j);
        }

    }

    for (int i = 0; i < endTime.length; i++) {

        int eventSpan = endTime[i] - startTime[i];
        if (gaps.contains(eventSpan)) {

            if (i > 0 && i < endTime.length - 1) {

                maxFreeTime = Math.max(maxFreeTime, startTime[i + 1] - endTime[i - 1]);

            } else if(i == 0) {

                maxFreeTime = Math.max(maxFreeTime, startTime[i + 1]);

            } else if(i == endTime.length - 1) {

                maxFreeTime = Math.max(maxFreeTime, eventTime - endTime[i - 1]);
            }

        }

    }

    System.out.println(gaps);

    return maxFreeTime;
}
