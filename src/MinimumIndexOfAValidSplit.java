//https://leetcode.com/problems/minimum-index-of-a-valid-split/description/

import java.util.List;

public class MinimumIndexOfAValidSplit {

    public static void main(String[] args) {
        List<Integer> nums = List.of(1,1);


        int size = nums.size();
        int[] arr = new int[size];
        int dominantNum = arr[0] = nums.get(0);
        int count = 1;
        for (int i = 1; i < size; i++) {
            int val = nums.get(i);
            arr[i] = val;
            if (val == dominantNum) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                dominantNum = val;
                count = 1;
            }
        }

        int list1DCount = 0;
        int list2DCount = 0;

        for (int n : arr) {
            if (n == dominantNum)
                list2DCount++;
        }

        int i = 0;
        for (int j = size; i < size; i++, j--) {
            if (arr[i] == dominantNum) {
                list1DCount++;
                list2DCount--;
            }
            if (list1DCount > (i + 1) / 2 && list2DCount > (j - 1) / 2)
                break;

        }
        if (i >= size)
            i = -1;        
        System.out.println(i);


    }
}
