void main(){
        for (int[] row : rotate(new int[][] { 
            { 1, 2, 3, 4 },
            { 5, 6, 7, 8 },
            { 9, 10, 11, 12 },
            { 13, 14, 15, 16 } })) {

        for (int i : row) {
            System.out.print(i + " ");
        }
        System.out.println();

    }
}

int[][] rotate(int[][] matrix) {

    int n = matrix.length;
    int temp, jumper;

    for (int i = 0; i < n / 2; i++) {
        for (int j = i; j < n - i - 1; j++) {
            jumper = matrix[i][j];

            temp = matrix[j][n - i - 1];
            matrix[j][n - i - 1] = jumper;
            jumper = temp;

            temp = matrix[n - i - 1][n - j - 1];
            matrix[n - i - 1][n - j - 1] = jumper;
            jumper = temp;

            temp = matrix[n - j - 1][i];
            matrix[n - j - 1][i] = jumper;
            jumper = temp;

            temp = matrix[j][j];
            matrix[i][j] = jumper;
        }
    }

    return matrix;

}

// 00 01 02
// 02 12 22

// 10 11 12
// 01 11 21

// 20 21 22
// 00 10 20