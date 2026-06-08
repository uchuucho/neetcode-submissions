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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode tail = head;
        ListNode curr1 = list1;
        ListNode curr2 = list2;
        if (list1== null && list2 == null) return null;
        else if (list1 == null) return list2;
        else if (list2 == null) return list1;
        else {
            while(curr1 != null && curr2 != null){
                if(curr1.val <= curr2.val) {
                    tail.next = curr1;
                    curr1 = curr1.next;
                } else {
                    tail.next = curr2;
                    curr2 = curr2.next;  
                }
                tail = tail.next;
            }
            if(curr1 == null) {
                tail.next = curr2;      
            } else if(curr2 == null) {
                tail.next = curr1;
            }

            return head.next;
        
        }
    }
}