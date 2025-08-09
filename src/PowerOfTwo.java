void main() {

    System.out.println(isPowerOfTwo(5));

}

public boolean isPowerOfTwo(int n) {

    return Long.bitCount(n) == 1;

}