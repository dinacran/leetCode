void main(){

    // Arrays.stream(getArr(7)).forEach(System.out::print);

    for (int iterable : getArr(10)) {

        System.out.print( iterable + " " );
        
    }

}

int[] getArr(int x){

    if(x == 0) return new int[]{1};
    if(x == 1) return new int[]{1,1};

    int[] prev = getArr(x-1);

    int[] res = new int[x+1];

    res[0] = 1;
    res[x] = 1;

    for(int i = 1; i < x; i++){
        res[i] = prev[i] + prev[i-1];
    }

    return res;



}