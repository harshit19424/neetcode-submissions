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
    public boolean hasCycle(ListNode head) {
        ListNode temp = head;

        if(temp == null){
            return false;
        }

        while(temp.next != null){
            temp.val *= -1;
            if(temp.next.val < 0){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
}
