import utils.ArrayUtils;

public class ZAlgorithm {

    public static void main(String[] args) {
        ArrayUtils.printArray(z("aabxaabxcaabxaabxay"));
    }

    public static int[] z(String str) {

        char[] s = str.toCharArray();

        int[] z = new int[s.length];

        for (int i = 1; i < s.length; i++) {

            int pp = 0, sp = i, match = 0;

            while (sp < s.length && s[pp] == s[sp]) {
                match++;
                pp++;
                sp++;
            }

            z[i] = match;
        }

        return z;
        

    }

}
