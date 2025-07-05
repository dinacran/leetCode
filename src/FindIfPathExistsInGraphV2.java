import java.util.Set;

void main(){
    
    System.out.println(validPath(3, new int[][]{{0,1},{0,2},{3,5},{5,4},{4,3}}, 0, 5));

}


public boolean validPath(int n, int[][] edges, int source, int destination) {

    Set<Integer> sourceSet = new HashSet<Integer>(); 
    Set<Integer> destSet = new HashSet<Integer>(); 

    for(int[] edge : edges){
        if(edge[0] == source) sourceSet.add(edge[1]);
        if(edge[1] == source) sourceSet.add(edge[0]);        
        if(edge[0] == destination) destSet.add(edge[1]);
        if(edge[1] == destination) destSet.add(edge[0]);
    }

    for(int i = 0; i < edges.length; i++){
        int[] edge = edges[i];
        if(sourceSet.contains(edge[0])) sourceSet.add(edge[1]);
        if(sourceSet.contains(edge[1])) sourceSet.add(edge[0]);        
        if(destSet.contains(edge[0])) destSet.add(edge[1]);
        if(destSet.contains(edge[1])) destSet.add(edge[0]);
    }

    for(int i = edges.length - 1; i > -1; i--){
        int[] edge = edges[i];
        if(sourceSet.contains(edge[0])) sourceSet.add(edge[1]);
        if(sourceSet.contains(edge[1])) sourceSet.add(edge[0]);        
        if(destSet.contains(edge[0])) destSet.add(edge[1]);
        if(destSet.contains(edge[1])) destSet.add(edge[0]);
    }

    System.out.println(sourceSet);
    System.out.println(destSet);

    return sourceSet.equals(destSet);

}

boolean has(int[] arr, int a) {
    return (arr[0] == a || arr[1] == a);
}

