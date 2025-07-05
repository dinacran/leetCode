import java.util.Arrays;
import java.util.Random;

void main(){
    Random r = new Random();

    int size = 10000000;
    int a[] = new int[size];

    for(int i = 0; i < size; i++){
        a[i] = r.nextInt((int)(System.currentTimeMillis()-100000000000000000l));
    }

    // for (int i : a) {
    //     System.out.print(i + ",");        
    // }

    // System.out.println("\n");

    // for (int i : mergeSort(a)) {
    //     System.out.print(i + ",");        
    // }

    // System.out.println("");


}

int[] mergeSort(int arr[]){

    int length = arr.length;

    if(length < 2)
    return arr;

    int mid = length / 2;

    int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
    int[] right = mergeSort(Arrays.copyOfRange(arr, mid, length));

    return merge(left, right);
    
}

int[] merge(int[] left, int[] right){

    int[] res = new int[left.length + right.length];

    int i = 0, j = 0, k = 0;

    while (i < left.length && j < right.length) {
        if (left[i] <= right[j]) {
            res[k++] = left[i++];
        } else {
            res[k++] = right[j++];
        }
    }

    while(i < left.length){
        res[k++] = left[i++];
    }

    while(j < right.length){
        res[k++] = right[j++];
    }

    return res;
}
