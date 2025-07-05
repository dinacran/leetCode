import java.util.HashSet;
import java.util.Set;

public class ReMapDigit {

    public static void main(String[] args) {
        System.out.println(minMaxDifference(11891));

    }

    public static int minMaxDifference(int num) {

        Set<Character> set = new HashSet<>();

        for (Character character : (num + "").toCharArray()) {

            set.add(character);

        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (Character character : set) {
            min = Math.min(Integer.parseInt((num + "").replaceAll(character + "", "0")), min);
            max = Math.max(Integer.parseInt((num + "").replaceAll(character + "", "9")), max);

        }

        return max - min;

    }

}
