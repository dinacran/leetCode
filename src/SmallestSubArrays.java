// https://leetcode.com/problems/smallest-subarrays-with-maximum-bitwise-or

import utils.ArrayUtils;

void main() {

    // System.out.println(smallestSubarrays(new int[]{1, 3, 4, 5}));

    ArrayUtils.printArray(smallestSubarrays(new int[]{1,0,2,1,3}));
    ArrayUtils.printArray(smallestSubarrays(new int[]{1, 2}));
    ArrayUtils.printArray(smallestSubarrays(new int[]{4,0,5,6,3,2}));

    // System.out.println(1 | 3 | 4 | 5);
    // System.out.println(14 ^ 6);

    // System.out.println(2 | 3);
    // System.out.println(3 ^ 3);
    // System.out.println(2 ^ 2);


}
    public int[] smallestSubarrays(int[] nums) {

        int[] resultArray = new int[nums.length];

        int max = 0;

        for(int i : nums) {
            max = max | i;

        }
        System.out.println(max);

        for(int i = 0; i < nums.length; i++){
            int subArrayLength = 0, temp = 0;

            for(int j = i; j < nums.length; j++){
                subArrayLength++;
                temp |= nums[j];

                if(temp >= max) break;
            }

            if(temp < max) resultArray[i] = 1;
            else
            resultArray[i] = subArrayLength;


        }

        return resultArray;

        
        
    }
