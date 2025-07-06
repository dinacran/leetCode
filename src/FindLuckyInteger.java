// https://leetcode.com/problems/find-lucky-integer-in-an-array

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.IntStream;

void main() {

    System.out.println(findLucky(new int[]{1,2,2,3,3,3}));

}

public int findLucky(int[] arr) {

    if(arr.length == 0) return -1;

    Map<Integer, Integer> map = new HashMap<>();

    for (int i : arr) {

        if (!map.containsKey(i)) {
            map.put(i, 1);
        }
        else {
            map.put(i, map.get(i) + 1);
        }
    }

    int max = Integer.MIN_VALUE;

    for (Entry<Integer, Integer> entry : map.entrySet()) {

        if(entry.getValue() == entry.getKey())
            max = Math.max(max, entry.getKey());
        
    }

    return max;

}
