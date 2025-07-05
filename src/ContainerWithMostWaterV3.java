// ContainerWithMostWaterV3ems/container-with-most-water/description/

void main() {

    System.out.println(maxArea(new int[] { 8,10,14,0,13,10,9,9,11,11}));

}

public int maxArea(int[] height) {

    int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
    int max1Ind = -1, max2Ind = -1;

    for (int i = 0; i < height.length; i++) {
        if (height[i] > max1) {
            max2 = max1;
            max2Ind = max1Ind;
            max1 = height[i];
            max1Ind = i;
        } else if (height[i] > max2) {
            max2 = height[i];
            max2Ind = i;
        }
    }
    System.out.println(max1Ind + " " + max2Ind);
    int left, right, leftInd, rightInd;
    if (max1Ind < max2Ind) {

        left = max1;
        right = max2;

        leftInd = max1Ind;
        rightInd = max2Ind;

    } else {
        left = max2;
        right = max1;

        leftInd = max2Ind;
        rightInd = max1Ind;
    }

    int max = (rightInd - leftInd) * Math.min(left, right);
    System.out.println(leftInd + " " + rightInd + " " + max);
    int temp = leftInd, finalLeft = left, finalLeftInd = leftInd;
    while (temp >= 0) {

        if ((rightInd - temp) * Math.min(height[temp], right) >= max) {
            max = (rightInd - temp) * Math.min(height[temp], right);
            finalLeft = height[temp];
            finalLeftInd = temp;
        }
        temp--;

    }
    System.out.println(finalLeft + " " + right + " " + max);
    temp = rightInd;
    int finalRight = right, finalRightInd = rightInd;
    while (temp < height.length) {

        if ((temp - finalLeftInd) * Math.min(finalLeft, height[temp]) >= max) {
            max = (temp - finalLeftInd) * Math.min(finalLeft, height[temp]);
            finalRight = height[temp];
            finalRightInd = temp;
        }
        temp++;

    }
    System.out.println(finalLeft + " " + finalRight);
    System.out.println(finalLeftInd + " " + finalRightInd);

    return (finalRightInd - finalLeftInd) * Math.min(finalLeft, finalRight);

}