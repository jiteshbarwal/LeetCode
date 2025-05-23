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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head, fast=head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode reverse = reverse(slow);
        ListNode Second_half = reverse;
        ListNode First_half = head;
        while (Second_half!=null){
            if (First_half.val!= Second_half.val){
                return false;
            }
            First_half=First_half.next;
            Second_half=Second_half.next;
        }
        return true;
    }

    public ListNode reverse(ListNode head){
        ListNode prev=null,curr=head;
        while (curr!=null){
            ListNode next = curr.next;
            curr.next= prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}