void main(){

    System.out.println(minTimeToReach(new int[][]{{0,4},{4,4}}));
}

public int minTimeToReach(int[][] grid) {

    int n = grid.length, m = grid[0].length;
    int i = 0, j = 0;

    int timer = 0;

    while(i < n || j < m){
        if((i+1 < n && j+1 < m) && grid[i+1][j] > timer && grid[i][j+1] > timer){
            if(grid[i+1][j] <= grid[i][j+1]){
                timer += grid[++i][j];                
            }else if(grid[i+1][j] > grid[i][j+1]){
                timer += grid[i][j++]; 
            }
        }
        else if((i+1 < n && j+1 < m) && (grid[i+1][j] < timer || grid[i][j+1] < timer)){
            if(grid[i+1][j] < timer){
                i++; timer++;
            }else if(grid[i][j+1] < timer){
                j++; timer++;
            }

        }
        i++;
    }

    return timer;
        
}