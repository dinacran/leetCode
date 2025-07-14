void main() {

    System.out.println(myAtoi("42"));
    System.out.println(myAtoi("0-1"));
    System.out.println(myAtoi(" -042"));
    System.out.println(myAtoi("1337c0d3"));
    System.out.println(myAtoi("-91283472332"));
    System.out.println(Integer.MAX_VALUE);
 
}

public int myAtoi(String s) {
    int result = 0, multiplier = 1;

    char[] arr = s.toCharArray();

    boolean isNegative = false, numberFound = false;

    for (char c : arr) {
        if (c == ' ' || c == '+') {
            if (numberFound)
                break;
            continue;

        }

        if (c == '-') {
            if (numberFound)
                break;

            isNegative = true;
            continue;
        }

        if (!Character.isDigit(c))
            break;

        else{
            numberFound = true;
            result = result * multiplier + (c - '0');
            multiplier = 10;
        }

    }

    if (isNegative)
        result *= -1;

    return result;

}
