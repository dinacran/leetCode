//https://leetcode.com/problems/maximum-value-of-an-ordered-triplet-i

public class MaximumTripletValue {

    public static void main(String[] args) {
        System.out.println((long)maximumTripletValue(new int[]{4,14,20,13,13,18,16,7,9,13,11,1}));
    }

    static long maximumTripletValue(int[] nums) {
        long max1 = 0;
        int max1Index = 0;

        long max2 = 0;
        int max2Index = 0;        

        for (int i = 0; i < nums.length-2; i++){
            if(nums[i] > max1){
                max1 = nums[i];
                max1Index = i;
            }
        }

        for (int i = max1Index + 2; i < nums.length; i++) {
            if(nums[i] >= max2){
                max2 = nums[i];
                max2Index = i;
            }
        }

        long min = nums[max1Index+1];
        int minIndex = 0;

        for(int i = max1Index; i < max2Index ; i++){
            if(nums[i] < min){
                min = nums[i];
                minIndex = i;
            }
        }

        long revMax1 = 0;
        int revMax1index = 0; 

        for(int i = nums.length - 1; i > 1; i--){
            if(nums[i] >= revMax1){
                revMax1 = nums[i];
                revMax1index = i;
            }
        }

        long revMax2 = nums[revMax1index-1];
        int revMax2index = 0; 

        for(int i = revMax1index - 1; i > -1; i--){
            if(nums[i] >= revMax2){
                revMax2 = nums[i];
                revMax2index = i;
            }
        }

        long min2 = nums[revMax1index - 1];
        int min2Index = 0;
        for (int i = revMax1index-1; i > revMax2index; i--) { 
            if (nums[i] < min2) {
                min2 = nums[i];
                min2Index = i;
            }
        }

        long min3 = nums[1];
        int min3Index = 0;
        for(int i = 2; i < nums.length-1; i++){
            if(nums[i] <= min3){
                min3 = nums[i];
                min3Index = i;
            }
        }

        long maxLeft = 0;
        int maxLeftIndex = 0; 
        for(int i = 0; i < min3Index; i++){
            if(nums[i] > maxLeft){
                maxLeft = nums[i];
                maxLeftIndex = i;
            }
        }

        long maxRight = 0;
        int maxRightIndex = 0;
        for(int i = min3Index+1; i < nums.length; i++){
            if(nums[i] > maxRight){
                maxRight = nums[i];
                maxRightIndex = i;
            }
        }

        System.out.println(max1 + " " + min + " " + max2);
        System.out.println(max1Index + " " + minIndex + " " + max2Index);


        System.out.println(revMax2 + " " + min2 + " " + revMax1);
        System.out.println(revMax2index + " " + min2Index + " " + max1Index); 
        System.out.println(maxLeft + " " + min3 + " " + maxRight);
        System.out.println(maxLeftIndex + " " + min3Index + " " + maxRightIndex);
        long val1 = (max1 - min) * max2;
        long val2 = (revMax2 - min2) * revMax1;
        long val3 = (maxLeft - min3) * maxRight;
        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);
        // if((long)val < 0) val = 0;
        return (val1 < 0 && val2 < 0 && val3 < 0)? -1 : Math.max(Math.max(val1, val2), val3);
}
}