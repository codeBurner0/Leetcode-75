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
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
       
        ListNode curr=head.next;
        ListNode temp=curr;
        ListNode prev=head;
        prev.next=null;
        
        while(curr.next!=null){
            curr=curr.next;
            temp.next=prev;
            prev=temp;
            temp=curr;
        }
        temp.next=prev;
    return curr;    
    }
}