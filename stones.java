// You are given an array of integers stones where stones[i] is the weight of the ith stone.

// We are playing a game with the stones. On each turn, we choose the heaviest two stones and smash them together. Suppose the heaviest two stones have weights x and y with x <= y. The result of this smash is:

// If x == y, both stones are destroyed, and
// If x != y, the stone of weight x is destroyed, and the stone of weight y has new weight y - x.
// At the end of the game, there is at most one stone left.

// Return the weight of the last remaining stone. If there are no stones left, return 0.

 
public class stones {

    public static void main(String[]args){



        int[] stones = {1,1};
        int max;
        int max_1;
        for(;stones.length > 1;){
            max = 0;
            max_1 = 0;
            for (int i = 0; i < stones.length; i++) {
                if (stones[i] > max) 
                    max = stones[i];               
            }
            stones = removeElement(stones, findIndex(stones,max));

            for (int i = 0; i < stones.length; i++) {
                if (stones[i] > max_1) 
                    max_1 = stones[i];               
            }
            if(max == max_1){
                stones = removeElement(stones, findIndex(stones,max_1));
            }
            else{
                stones[findIndex(stones, max_1)] = max - max_1; 
            }
            
    }

    if(stones.length > 0)
                System.out.println(stones[0]);
            else
                System.out.println(0);


    
}


public static int[] removeElement(int[] array, int indexToRemove) {
    if (indexToRemove < 0 || indexToRemove >= array.length) {
        
        return array;
    }
    
    int[] newArray = new int[array.length - 1];
    
    
    System.arraycopy(array, 0, newArray, 0, indexToRemove);
    
    
    System.arraycopy(array, indexToRemove + 1, newArray, indexToRemove, newArray.length - indexToRemove);
    
    return newArray;
}
public static int findIndex(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == target) {
            return i; 
        }
    }
    return -1; 
}

}
