// https://leetcode.com/problems/reverse-integer/

void main() {

    System.out.println(reverse(-1534236469));

}

public int reverse(int x) {

    int temp = Math.abs(x);

    int result = 0;
    while (temp > 0) {

        int temp1 = result;
        for (int i = 1; i < 10 && result > 0; i++) {
            result += temp1;

            if (result < 0)
                return 0;
        }

        System.out.println(result);

        result += temp % 10;
        temp /= 10;
    }

    if (x < 0)
        result *= -1;
    return result;

}