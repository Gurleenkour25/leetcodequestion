/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        Node slow = null;
        Node fast = null;
        while(fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.next;
    }
}