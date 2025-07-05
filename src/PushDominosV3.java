import java.io.IO;

void main(){ IO.println(pushDominoes("L.....RR.RL.....L.R."));

}


public String pushDominoes(String dominoes) {

    char[] doms = dominoes.toCharArray();
    int length = doms.length;
    int i = 0;

    while (i < length) {
        if (doms[i] == 'R') {
            int j = i + 1;
            while (j < length && doms[j] == '.') j++;
            if (j < length && doms[j] == 'L') {
                int mid = (j - i - 1) / 2;
                for (int k = 0; k <= mid; k++) {
                    doms[i + 1 + k] = 'R';
                    doms[j - 1 - k] = 'L';
                }
            } else {
                for (int k = i + 1; k < j; k++) {
                    doms[k] = 'R';
                }
            }
            i = j;
        } else {
            i++;
        }
    }    
    return new String(doms);

}