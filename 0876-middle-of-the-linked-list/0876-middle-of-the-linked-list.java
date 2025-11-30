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
        int i = 0;
     ListNode curr = head;
  while(curr != null)
  {
    curr = curr.next;
    i++;
  }

  int mid = i/2;

  curr = head;
 i =0;

 while(i < mid)
 {
    curr = curr.next;
    i++;
 }

return curr;
    }
}