// https://leetcode.com/problems/reverse-integer/

void main() {

    System.out.println(reverse(1534236469));
    System.out.println(Integer.MAX_VALUE);
    System.out.println(Integer.MAX_VALUE + 1);
    System.out.println(964632435 * 10);

}

public int reverse(int x) {


    int temp = Math.abs(x);

    int result = 0;
    if (x > 0) {
        while (temp > 0) {
            result = result * 10 + temp % 10;
            
            System.out.println(result);
            if (result < 0)
                return 0;
            temp /= 10;
        }
    } else {
        while (temp > 0) {
            result = result * 10 + temp % 10;
            System.out.println(result);
            if (result < 0)
                return 0;
            temp /= 10;
        }

        result *= -1;

    }
    return result;

}