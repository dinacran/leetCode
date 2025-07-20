// https://leetcode.com/problems/longest-palindromic-substring/

void main(String... a) {

    System.out.println(longestPalindrome("abaabab"));
    System.out.println(longestPalindrome("aaaabbb"));
}

public String longestPalindrome(String s) {
    if (s.length() < 2)
        return s;

    String result = "";

    for (int i = 1; i < s.length(); i++) {
        int left = i - 1, right = i;

        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        if (right - left - 1 > result.length()) {
            result = s.substring(left + 1, right);
        }

        left = i - 1;
        right = i + 1;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        if (right - left - 1 > result.length()) {
            result = s.substring(left + 1, right);
        }
    }

    return result;

}