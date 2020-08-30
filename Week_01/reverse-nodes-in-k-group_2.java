class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode tmp = pre;
        ListNode end = pre;
        while (true) {
            for (int i = 0 ; i < k ; i++) {
                 if(end != null) {
                     end = end.next;
                 }
            }
            if (end == null) {
                 break;
            }
            ListNode start = tmp.next;
            ListNode next = end.next;
            end.next = null;
            tmp.next = reverse(start);
            start.next = next;
            tmp = start;
            end = start;
        }
        return pre.next;
    }
    // 1-2-3-4
    public ListNode reverse(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

}
