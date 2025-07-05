// https://leetcode.com/problems/container-with-most-water/description/

void main() {

    System.out.println(maxArea(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 }));

}

public int maxArea(int[] height) {

    int max = 0;

    for (int left = 0; left < height.length - 1; left++) {

        for (int right = height.length - 1; right > left; right--) {
            int area = (right - left) * Math.min(height[left], height[right]);
            if (area > max)
                max = area;
        }

    }

    return max;

}