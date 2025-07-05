// ContainerWithMostWaterV2blems/container-with-most-water/description/

void main() {

    System.out.println(maxArea(new int[] {1,2,4,3}));

}

public int maxArea(int[] height) {


    int max1 = 0, max2 = 0;
    int max1Ind = 0, max2Ind = 0;

    for (int i = 0; i < height.length; i++) {
        if (height[i] > max1) {
            max2 = max1;
            max1 = height[i];
            max1Ind = i;
        } else if (height[i] > max2) {
            max2 = height[i];
            max2Ind = i;
        }
    }
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
    int temp = leftInd, finalLeft = left, finalLeftInd = leftInd;
    while (temp >= 0) {

        if ((leftInd - temp) + height[temp] >= finalLeft) {
            finalLeft = height[temp];
            finalLeftInd = temp;
        }
        temp--;

    }
    temp = rightInd;
    int finalRight = right, finalRightInd = rightInd;
    while (temp < height.length) {

        if ((temp - rightInd) + height[temp] >= finalRight) {
            finalRight = height[temp];
            finalRightInd = temp;
        }
        temp++;

    }
    // System.out.println(finalLeft + " "+ finalRight);

    return (finalRightInd - finalLeftInd) * Math.min(finalLeft, finalRight);
}