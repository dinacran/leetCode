//https://leetcode.com/problems/minimum-domino-rotations-for-equal-row/


void main(){

    IO.println(minDominoRotations(new int[]{1,2,3,4,6}, new int[]{6,6,6,6,5}));

}

public int minDominoRotations(int[] tops, int[] bottoms) {

    Map<Integer, Integer> map = new HashMap<>();

    int ans = -1;
    
    int length = tops.length;

    for(int i : tops){
        if(map.containsKey(i)) map.put(i, map.get(i) + 1);
        else map.put(i, 1);
    }
    int size = map.size();

    out: for(int i = 0; i < size; i++){

        int max = 0;
        int tempKey = 0;

        for(int k : map.keySet()){
            if(map.get(k) > max){
                max = map.get(k);
                tempKey = k;
            }
        }

        for(int l = 0; l < length; l++){
            while(l < length && tops[l] == tempKey) l++;

            if(l == length  || l + 1 == length) {
            ans = length - max;
            break out;
        }

            if(bottoms[l] != tempKey){
                map.remove(tempKey);
                continue out;
            }
        }
    }

    int botRes = lookBottom(tops, bottoms);

    if(ans == -1 && botRes == -1) return -1;
    if(ans == -1) return botRes;
    return Math.min(ans, botRes);

}

public int lookBottom(int[] tops, int[] bottoms){
    int ans = -1;

    Map<Integer, Integer> map = new HashMap<>();
    
    int length = bottoms.length;

    for(int i : bottoms){
        if(map.containsKey(i)) map.put(i, map.get(i) + 1);
        else map.put(i, 1);
    }
    int size = map.size();

    out: for(int i = 0; i < size; i++){

        int max = 0;
        int tempKey = 0;

        for(int k : map.keySet()){
            if(map.get(k) > max){
                max = map.get(k);
                tempKey = k;
            }
        }

        for(int l = 0; l < length; l++){
            while(l < length && bottoms[l] == tempKey) l++;

            if(l == length || l + 1 == length) {
            ans = length - max;
            break out;
        }

            if(tops[l] != tempKey){
                map.remove(tempKey);
                continue out;
            }
        }
    }


    return ans;
}
