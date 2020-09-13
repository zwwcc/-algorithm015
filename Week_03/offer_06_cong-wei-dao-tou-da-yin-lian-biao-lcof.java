// stack
class Solution {
    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while(head != null){
            stack.push(head.val);
            head = head.next;
        }
        int[] nums = new int[stack.size()];
        int index = 0;
        while (!stack.empty()){
            nums[index++] = stack.pop();
        }
        return nums;
    }
}
// 反转
class Solution1 {
    private int count = 0;
    public int[] reversePrint(ListNode head) {
        ListNode pre = rev(head);
        int[] arr = new int[count];
        int index = 0;
        while(pre != null){
            arr[index++] = pre.val;
            pre = pre.next;
        }
        return arr;
    }
    public ListNode rev(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;
        while (cur != null){
            count++;
            // 2
            ListNode next = cur.next;
            // 1->null
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
