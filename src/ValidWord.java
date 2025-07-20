// https://leetcode.com/problems/valid-word

void main() {
    System.out.println(isValid("Ya$"));
}

public boolean isValid(String word) {

    if (word.length() < 3)
        return false;

    boolean vowel = false;
    boolean cons = false;

    for (int i = 0; i < word.length(); i++) {
        char c = word.charAt(i);

        if (Character.isAlphabetic(c)) {
            boolean temp = c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E'
                    || c == 'I' || c == 'O' || c == 'U';
            if (!vowel)
                vowel = temp;

            if (!cons)
                cons = !temp;

        } else if (!Character.isDigit(c))
            return false;
    }

    return vowel && cons;
}
