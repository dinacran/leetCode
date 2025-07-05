//https://leetcode.com/problems/maximum-value-of-an-ordered-triplet-i

public class MaximumTripletValueV2 {

    public static void main(String[] args) {
        System.out.println((long)maximumTripletValue(new int[]{481345,1858,559998,383740,222422,483438,22022,783145,645481,932573}));
    }

    static long maximumTripletValue(int[] nums) {

        long max = 0;
        int length = nums.length;

        for(int j = 1; j < length-1; j++){

        long maxLeft = 0;
        for(int i = 0; i < j; i++){
            if(nums[i] > maxLeft){
                maxLeft = nums[i];
            }
        }

        long maxRight = 0;
        for(int i = j + 1; i < length; i++){
            if(nums[i] > maxRight){
                maxRight = nums[i];
            }
        }

        max = Math.max(max, (maxLeft - nums[j]) * maxRight);

    }

        if(max < 0) max = -1;
        return max;
}
}