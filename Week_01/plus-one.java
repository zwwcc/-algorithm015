class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for (int i = len -1; i >= 0; i--) {
            digits[i]++;
            int idx = digits[i] % 10;
            if (idx != 0){
                return digits;
            }
            digits[i] = 0;
        }
        int[] arr = new int[len + 1];
        arr[0] = 1;
        return arr;
    }
}