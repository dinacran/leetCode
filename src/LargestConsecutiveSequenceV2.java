//https://leetcode.com/problems/longest-consecutive-sequence/description/

void main(){
    System.out.println(longestConsecutive(new int[]{0,-1,7,2,5,8,4,6,0,1}));
}
public Integer longestConsecutive(int[] nums) {
    Set<Integer> set = new HashSet<>();

    for (Integer i : nums) set.add(i);

    int length = 0;
    
    for (Integer integer : set) {
        if(!set.contains(integer-1)){
            int temp = 1;
            while(set.contains(integer+length)) temp++;
            length = Math.max(temp, length);
        }
    }

    return length;


}