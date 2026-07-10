import java.util.Arrays;

class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {

        int i = 0, j = 0, k = 0;

        int n1 = nums1.length;
        int n2 = nums2.length;

        int[] nums3 = new int[n1 + n2];

        while (i < n1 && j < n2) {

            int val;

            if (nums1[i] == nums2[j]) {
                val = nums1[i];
                i++;
                j++;
            }
            else if (nums1[i] < nums2[j]) {
                val = nums1[i++];
            }
            else {
                val = nums2[j++];
            }

            // avoid duplicates
            if (k == 0 || nums3[k - 1] != val) {
                nums3[k++] = val;
            }
        }

        while (i < n1) {
            if (k == 0 || nums3[k - 1] != nums1[i]) {
                nums3[k++] = nums1[i];
            }
            i++;
        }

        while (j < n2) {
            if (k == 0 || nums3[k - 1] != nums2[j]) {
                nums3[k++] = nums2[j];
            }
            j++;
        }

        return Arrays.copyOf(nums3, k);
    }
}
