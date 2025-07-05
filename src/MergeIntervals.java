//https://leetcode.com/problems/merge-intervals/

import java.util.ArrayList;
import java.util.List;

import utils.ArrayUtils;

void main() {

    ArrayUtils.print2DArray(merge(new int[][] { { 1, 4 }, { 4, 5 } }));

}

public int[][] merge(int[][] intervals) {

    List<int[]> interval = new ArrayList<>(List.of(intervals));
    interval.sort((a, b) -> Integer.compare(a[0], b[0]));

    List<int[]> res = new ArrayList<>();

    for (int i = 0; i < interval.size(); i++) {
        int start = interval.get(i)[0];
        int end = interval.get(i)[1];
        for (int j = i + 1; j < interval.size(); j++) {

            if (interval.get(j)[0] <= end) {
                if (interval.get(j)[1] > end)
                    end = interval.get(j)[1];
                if (interval.get(j)[0] < start)
                    start = interval.get(j)[0];
                interval.remove(j--);
            }
        }
        res.add(new int[] { start, end });
    }

    return res.toArray(new int[0][]);

}
