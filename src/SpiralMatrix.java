import java.util.ArrayList;
import java.util.List;

void main(){

    System.out.println(spiralOrder(new int[][] { 
        { 1,  2,  3 },
        { 5,  6,  7 },
        { 9, 10, 11 }}));


}

public List<Integer> spiralOrder(int[][] matrix) {

    List<Integer> res = new ArrayList<Integer>();

    int height = matrix.length;
    int width = matrix[0].length;

    for(int i = 0; i < height/2 + 1; i++){


        if(width % 2 == 0)
        for(int j = i; j < width - i - 1; j++){
            res.add(matrix[i][j]);
        }
        else
        for(int j = i; j <= width - i - 1; j++){
            res.add(matrix[i][j]);
        }

        System.out.println(res);

        for(int j = i; j <  height - i - 1; j++){
            res.add(matrix[j][width - i - 1]);
        }
        System.out.println(res);

        for (int j = width - i - 1; j > i; j--){
            res.add(matrix[height - i - 1][j]);
        }
        System.out.println(res);


        for (int j = height - i - 1; j > i ; j--){
            res.add(matrix[j][i]);
        }
        System.out.println(res);



    }
        

    return res;
}


// 00 01 02

// 10 11 12

// 20 21 22
