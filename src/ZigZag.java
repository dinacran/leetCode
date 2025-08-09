// https://leetcode.com/problems/zigzag-conversion/


void main() {

    System.out.println(convert("PAYPALISHIRING", 3));

}

public String convert(String s, int numRows) {

    if (s.length() < 3)
        return s;

    int ptr = 0, length = s.length(), cLength = numRows - 2;

    int temp = length;
    int cols = 0;
    while (temp > 0) {
        cols++;
        temp -= numRows;
        if (temp > 0) {
            cols++;
            temp -= cLength;
        }
    }
    char[][] res = new char[numRows][cols];

    System.out.println(cols);

    for(int i = 0; i < cols; i++){
        if ((i & 1) == 0) {
            for(int j = 0; j < numRows && ptr < length; j++){
                res[j][i] = s.charAt(ptr++);
            }
        }
        else {
            for(int j = cLength; j > 0 && ptr < length; j--){
                res[j][i] = s.charAt(ptr++);
            }
        }
    }

    
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < numRows; i++){
        for(int j = 0; j < cols; j++){
            if(res[i][j] != 0)
                sb.append(res[i][j]);
        }
    }
    
    return sb.toString();


}