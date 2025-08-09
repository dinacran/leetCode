package dsa;

import utils.ArrayUtils;

public class StupidSort {
	public static void main(String[] args) {

        ArrayUtils.printArray(sort(new int[]{5,3,2,6,300000000}));
		
	}

    public static int[] sort(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i : arr)
            max = Math.max(max, i);


        boolean[] boolArr = new boolean[max+1];

        for (int i : arr)
            boolArr[i] = true;


        int[] result = new int[arr.length];
        int ptr = 0;

        for(int i = 0; i <= max; i++)
            if(boolArr[i])
                result[ptr++] = i;
        
        return result;

    }
}
