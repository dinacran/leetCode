// https://leetcode.com/problems/roman-to-integer/

void main() {

    System.out.println(romanToInt("XC"));
    System.out.println(romanToInt("MCMXCIV"));
    System.out.println(romanToInt("III"));
    System.out.println(romanToInt3("XII"));
    System.out.println(romanToInt3("MMMMMMM"));
    System.out.println(romanToInt3("DCC"));
    System.out.println(romanToInt3("CCCCCCCCCC"));
    System.out.println(romanToInt3("M"));

}



public int romanToInt(String s) {
    int result = 0;

    Map<Character, Integer> map = Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);

    for (int i = 0; i < s.length(); i++) {
        if (i + 1 < s.length() && map.get(s.charAt(i + 1)) <= map.get(s.charAt(i))) {
            result += map.get(s.charAt(i));
        } else if (i + 1 < s.length()) {
            result += map.get(s.charAt(i + 1)) - map.get(s.charAt(i));
            i++;
        } else if (i < s.length())
            result += map.get(s.charAt(i));

    }
    return result;

}

public int romanToInt2(String s) {
    int result = 0;

    Map<Character, Integer> map = Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);

    for (int i = 0; i < s.length(); i++) {
        if (i + 1 < s.length() && map.get(s.charAt(i + 1)) <= map.get(s.charAt(i))) {
            result += map.get(s.charAt(i));
        } else if (i + 1 < s.length()) {
            result += map.get(s.charAt(i + 1)) - map.get(s.charAt(i));
            i++;
        } else if (i < s.length())
            result += map.get(s.charAt(i));

    }
    return result;

}

public int romanToInt3(String s) {
    int result = 0, prev = 0;

    for (int i = s.length() - 1; i >= 0; i--) {

        int intVal = switch (s.charAt(i)) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 1;
        };

        if (intVal < prev) {
            result -= intVal;
        } else {
            result += intVal;
        }
        prev = intVal;

    }
    return result;
}