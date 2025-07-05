void main(){

}

public int[] twoSum(int[] numbers, int target) {

    int tempNum;
    int tempInd;
    for(int i = 0; i < numbers.length - 1; i++){
        tempNum = target - numbers[i];
        
        tempInd = search(numbers, tempNum, i+1, numbers.length-1);
        if(tempInd != -1){
            return new int[]{i+1, tempInd+1};
        }

    }

    return new int[]{};
        
}

int search(int[] nums, int num, int start, int end){

    int mid = (end - start)/2 + start;

    if(start > end) return -1;
    if(nums[mid] == num) return mid;
    if(nums[mid] < num) return search(nums, num, mid + 1, end);
    else return search(nums, num, start, mid - 1);

}
