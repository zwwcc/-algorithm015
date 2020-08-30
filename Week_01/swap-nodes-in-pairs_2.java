class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode sp  = new ListNode(0);
        sp.next = head;
        ListNode tmp = sp;
        while(head != null && head.next != null) {
            ListNode start = head;
            ListNode end = head.next;
            ListNode next = end.next;
            end.next = start;
            start.next = next;
            tmp.next = end;
            tmp = start;
            head = next;
        }
        return sp.next;
    }
}
