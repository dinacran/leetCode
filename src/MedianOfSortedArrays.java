
void main() {

    System.out.println(findMedianSortedArrays(new int[] { 1, 3 }, new int[] { 2 }));

}

public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

    int aLen = nums1.length;
    int bLen = nums2.length;
    int[] result = new int[aLen + bLen];

    int i = 0, j = 0, k = 0;

    while (i < nums1.length && j < nums2.length) {
        if (nums1[i] <= nums2[j]) {
            result[k++] = nums1[i++];
        } else {
            result[k++] = nums2[j++];
        }

        if (k > (aLen + bLen) / 2)
            break;
    }

    while (i < nums1.length) {
        result[k++] = nums1[i++];
        if (k > (aLen + bLen) / 2)
            break;
    }

    while (j < nums2.length) {
        result[k++] = nums2[j++];
        if (k > (aLen + bLen) / 2)
            break;
    }

    int rlen = result.length;
    double ans;
    if (rlen % 2 == 0) {
        ans = (double) (result[(rlen - 1) - 1] + result[rlen - 2]) / 2;

    } else
        ans = (double) result[rlen - 1];
    return ans;
}
