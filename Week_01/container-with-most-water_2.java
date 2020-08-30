class Solution {
    public int maxArea(int[] height) {
        int right = height.length - 1;
        int left = 0 ;
        int area = 0;
        while (left < right) {
            int min = height[left] > height[right] ? height[right --] : height[left ++];
            area = Math.max(area,(right - left + 1) * min);
        }
        return area;
    }
}
