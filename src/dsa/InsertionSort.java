package dsa;

import utils.ArrayUtils;

public class InsertionSort {

    public static void main(String[] args) {

        ArrayUtils.printArray(sort(new int[]{7,4,2,5,6}));
        
    }
    
    public static int[] sort(int[] arr) {
        for(int i = 1, j = i - 1; i < arr.length; i++, j = i - 1) {
            int temp = arr[i];

            while(j >= 0 && temp < arr[j]) {

                arr[j + 1] = arr[j--];

            }
            arr[j + 1] = temp;
        }

        return arr;
    }
    
}
