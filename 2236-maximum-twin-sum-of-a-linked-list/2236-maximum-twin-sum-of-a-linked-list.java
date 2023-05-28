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

    public ListNode reverseNode(ListNode head){
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
    public int pairSum(ListNode head) {
        int res=Integer.MIN_VALUE;
        if(head.next.next==null){
            res=head.val+head.next.val;
        }
        ListNode temp=head;
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        slow.next=reverseNode(slow.next);
        slow=slow.next;
        ListNode slowPointer=slow;
        while(temp!=slowPointer){
            int valu=temp.val+slow.val;
            res=Math.max(valu,res);
            temp=temp.next;
            slow=slow.next;
        }
    return res;
    }
}