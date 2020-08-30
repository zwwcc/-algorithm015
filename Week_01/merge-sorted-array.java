// 一次ac
class Solution {
    // 暴力解
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3 = new int[m];
        // copy nums1
        for (int i = 0; i < m ;i++) {
            nums3[i] = nums1[i];
        } 
        int j = 0; 
        int k = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (j < m && k < n){
                if (nums3[j] < nums2[k]) {
                    nums1[i] = nums3[j ++];
                }else{
                    nums1[i] = nums2[k ++];
                }
            }else if (j >= m && k < n) {
                nums1[i] = nums2[k ++];
            }else if (j < m && k >= n) {
                nums1[i] = nums3[j ++];
            }
        }
    }
}

// 优化
class Solution1 {
    // 双指针
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len = nums1.length;
        int p1 = m - 1;
        int p2 = n - 1;
        int p3 = m + n - 1;
        while(p2 >= 0 ) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[p3 --] = nums1[p1 --];
            }else{
                nums1[p3 --] = nums2[p2 --];
            }
        }
    }
}