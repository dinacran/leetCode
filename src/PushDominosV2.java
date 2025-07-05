import java.io.IO;

void main(){  
    IO.println(pushDominoes("L.....RR.RL.....L.R."));

}
public String pushDominoes(String s) {
    s = "L" + s + "R";  
    char[] arr = s.toCharArray(); 
    int n = arr.length;
    int prev = 0;

    for (int curr = 1; curr < n; ++curr) {
        if (arr[curr] == '.') continue;

        int span = curr - prev - 1;

        if (arr[prev] == arr[curr]) {
            for (int i = 1; i <= span; ++i)
                arr[prev + i] = arr[prev];
        } else if (arr[prev] == 'L' && arr[curr] == 'R') {
            for (int i = 1; i <= span; ++i)
                arr[prev + i] = '.';
        } else { // R...L
            int half = span / 2;
            for (int i = 1; i <= half; ++i)
                arr[prev + i] = 'R';
            if (span % 2 == 1)
                arr[prev + half + 1] = '.';
            for (int i = 1; i <= half; ++i)
                arr[prev + half + 1 + i] = 'L';
        }

        prev = curr;
    }

    return new String(arr, 1, n - 2);
}