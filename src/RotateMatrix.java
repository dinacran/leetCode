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

public int[][] rotate(int[][] matrix) {

    int n = matrix.length;

    for(int i = 0; i < n; i++){
        for(int j = 0; j < i; j++){
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
    }

    for(int i = 0; i < n; i++){
        for(int j = 0; j < n/2; j++){
            int temp = matrix[i][j];
            matrix[i][j] = matrix[i][n-j-1];
            matrix[i][n-j-1] = temp;

        }
    }
    return matrix;
}
