class Test{

public static void main(String[] args) throws InterruptedException {
    
    char a = Character.valueOf('1');
    String b = "10";
    b.wait();

    System.out.println(a);
}}