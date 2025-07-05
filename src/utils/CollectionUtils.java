package utils;

import java.util.List;
import java.util.Set;

public class CollectionUtils {
    
    public static void printListOfListString(List<List<String>> list){
        for(List<String> l : list){
            for(String s : l){
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }

    
    public static void printIntSet(Set<Integer> set){
        for(int i : set){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    
    public static void printCharSet(Set<Character> set){
        for(char i : set){
            System.out.print("\"" + i + " ");
        }
        System.out.println();
    }
}
