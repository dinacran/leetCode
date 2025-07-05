import java.util.Random;

import component.BinaryTree;

public class App {

    public String str;

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        BinaryTree tree = new BinaryTree();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            tree.insert(random.nextInt());
        }

      
    }

    public static void meth(){

    }
}
