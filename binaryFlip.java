

// A bit flip of a number x is choosing a bit in the binary representation of x and flipping it from either 0 to 1 or 1 to 0.

// For example, for x = 7, the binary representation is 111 and we may choose any bit (including any leading zeros not shown) and flip it. We can flip the first bit from the right to get 110, flip the second bit from the right to get 101, flip the fifth bit from the right (a leading zero) to get 10111, etc.
// Given two integers start and goal, return the minimum number of bit flips to convert start to goal

public class binaryFlip {

    public static void main(String[] args) {
        int number = 3;
        int temp = 4;

        
        System.out.println(equalizeStrings(Integer.toBinaryString(number), Integer.toBinaryString(temp)));

    }

    public static int equalizeStrings(String str1, String str2) {
        int lengthDifference = Math.abs(str1.length() - str2.length());


        

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < lengthDifference; i++) {
            result.append('0');
        }
        String temp = "";
        if (str1.length() < str2.length()) {
            result.append(str1);
            temp = str2;

        } else {
            result.append(str2);
            temp = str1;
        }
        String str = result.toString();
        int differences = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != temp.charAt(i)) {
   
                differences++;
            }
        }

        return differences;
    }
}
