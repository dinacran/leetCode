import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import utils.ArrayUtils;

void main() {

    Integer[] arr1 = { -1, 0, 1, 2, -1, -4 };

    System.out.println(threeSum(arr1));

}

public List<List<Integer>> threeSum(Integer[] nums) {

    ArrayUtils.printArray(nums);

    Set<List<Integer>> set = new HashSet<>();

    for (int i = 0; i < nums.length - 2; i++) {
        for (int j = nums.length - 1; j > i + 1; j--) {
            int x = (nums[i] + nums[j]) * -1;
            System.out.println(x);
            for (int k = i + 1; k < j; k++) {
                if (nums[k] == x) {
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                    temp.sort((a, b) -> Integer.compare(b, a));
                    set.add(temp);
                }
            }
        }
    }

    return new ArrayList<>(set);
}
