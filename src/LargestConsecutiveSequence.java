//https://leetcode.com/problems/longest-consecutive-sequence/description/

import utils.ArrayUtils;

void main(){

    System.out.println(longestConsecutive(new int[]{0,-1,7,2,5,8,4,6,0,1}));
    

}
public int longestConsecutive(int[] nums) {

    int min = nums[0];
    int max = nums[0];

    for (int i : nums) {
        max = Math.max(i, max);
        min = Math.min(i, min);
    }
    boolean[] pos = new boolean[Math.abs(max) + 1];

    for (int i : nums) {
        pos[i] = true;
    }
    int count = 0; 
    int length = 0;

    for(boolean bool: pos){

        if(bool) count++;
        else{
            length = Math.max(count, length);
            count = 0;
        }
    }
    return Math.max(count, length);
}
