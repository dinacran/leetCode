package utils;

public class ArrayUtils {

    public static void print2DArray(int[][] arr) {
        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
    public static void printArray(Integer[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void printTrueIndices(boolean[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    
    public static void printBooleanArray(boolean[] arr) {
        for (boolean val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

}
