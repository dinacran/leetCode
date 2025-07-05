// https://leetcode.com/problems/valid-palindrome/description/

void main() {

    System.out.println(isPalindrome("0P"));
}

public boolean isPalindrome(String s) {

    char[] str = s.toLowerCase().toCharArray();

    int left = 0, right = str.length - 1;

    while (left < right) {

        while (left < right && !Character.isLetterOrDigit(str[left])) {
            left++;
        }

        while (left < right && !Character.isLetterOrDigit(str[right])) {
            right--;
        }

        if(str[left] != str[right])
        return false;

        left++;
        right--;
    }
    return true;

}
