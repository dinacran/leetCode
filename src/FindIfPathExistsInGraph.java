
void main() {

    System.out.println(validPath(3, new int[][]{{0,1},{1,2},{2,0}}, 0, 2));

}


public boolean validPath(int n, int[][] edges, int source, int destination) {

    int currentSource = source;
    int currentSourceNeih = 0;

    for(int[] edge : edges){
        if(edge[0] == source) currentSourceNeih = edge[1];
        if(edge[1] == source) currentSourceNeih = edge[0];
    }
    System.out.println(currentSourceNeih);
    out:
    for (int[] t : edges) {

        for (int[] edge : edges) {
            if(has(edge, currentSource)){
                if(currentSourceNeih == destination) break out;

                currentSource = edge[0] == currentSource ? edge[1] : edge[0];
                currentSourceNeih = edge[0] == currentSource ? edge[0] : edge[1];
            }
                            
        }

    }

    return currentSourceNeih == destination;

}

boolean has(int[] arr, int a) {
    return (arr[0] == a || arr[1] == a);
}

