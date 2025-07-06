void main() {

    System.out.println(reverse(-1534236469));

}

public int reverse(int x) {


    int temp = Math.abs(x);

    int result = 0;
        while (temp > 0) {

            int temp1 = result;
            for(int i = 1; i < 10 && result > 0; i++)
            {
                if(Integer.MAX_VALUE > result + temp1 && result + temp1 > 0)
                    result += temp1;
                else
                    return 0;
            }

            System.out.println(result);

            result += temp % 10;        
            temp /= 10;
        }

    if(x < 0) result *= -1;
    return result;

}