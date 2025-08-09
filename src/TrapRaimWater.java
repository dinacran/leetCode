import utils.ArrayUtils;

void main() {

    System.out.println(trap(new int[] { 1, 0, 3, 0, 5, 0, 7 }));
    System.out.println(trap(new int[] { 1, 1, 1, 0, 1, 0, 1 }));
    System.out.println(trap2(new int[] { 1, 1, 1, 0, 1, 0, 1 }));

}

public int trap(int[] height) {
    int volume = 0;

    int[] rightMax = new int[height.length + 1];

    for (int i = height.length - 1; i > 0; i--) {
        rightMax[i] = Math.max(height[i], rightMax[i + 1]);
    }

    int leftMax = 0;

    for (int i = 0; i < height.length; i++) {

        volume += Math.max(0, Math.min(leftMax, rightMax[i + 1]) - height[i]);

        leftMax = Math.max(leftMax, height[i]);
    }

    ArrayUtils.printArray(rightMax);

    return volume;

}

public int trap2(int[] height) {
    int volume = 0;

    int left = 0;
    int right = height.length - 1;

    int leftMax = height[left++];
    int rightMax = height[right--];

    while (left < right) {
        leftMax = Math.max(leftMax, height[left]);
        rightMax = Math.max(rightMax, height[right]);
        if (leftMax < rightMax) {
            volume += leftMax - height[left];
            left++;
        } else {
            volume += rightMax - height[right];
            right--;
        }

    }

    return volume;
}