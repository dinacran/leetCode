//https://leetcode.com/problems/valid-sudoku

import java.util.HashSet;

void main() {

    System.out.println(isValidSudoku(new char[][] { 
            { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
            { '6', '.', '.', '1', '9', '5', '.', '.', '.' }, 
            { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
            { '8', '.', '.', '.', '6', '.', '.', '.', '3' }, 
            { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
            { '7', '.', '.', '.', '2', '.', '.', '.', '6' }, 
            { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
            { '7', '.', '.', '4', '1', '9', '.', '.', '5' }, 
            { '.', '.', '.', '.', '8', '.', '.', '7', '9' } }));

}

public boolean isValidSudoku(char[][] board) {

    for (int i = 0; i < 9; i++) {
        int count = 0;
        int count2 = 0;
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int j = 0; j < 9; j++) {
            if (Character.isDigit(board[i][j])) {
                set.add(board[i][j] - 48);
                count++;
            }
            if (Character.isDigit(board[j][i])) {
                set2.add(board[j][i] - 48);
                count2++;
            }
        }
        if (set.size() != count || set2.size() != count2)
            return false;
    }
    int[][] points = new int[][]{{0, 0}, {0, 3}, {0, 6}, {3, 0}, {3, 3}, {3,6}, {6, 0}, {6, 3}, {6, 6}};

    for (int[] point : points) {
        int count = 0;
        Set<Integer> set = new HashSet<>();        
        for(int i = point[0]; i <= point[0]+2; i++){
            for(int j = point[1]; j<= point[1]+2; j++){
                if (Character.isDigit(board[i][j])) {
                    set.add(board[i][j] - 48);
                    count++;
                }
            }
        }
        if (set.size() != count)
        return false;        
    }
    return true;

}
