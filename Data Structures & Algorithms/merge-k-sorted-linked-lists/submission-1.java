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
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        //we divide into subproblems
        return mergeSort(lists, 0, lists.length - 1);
    }

    public ListNode mergeSort(ListNode[] lists, int l, int r) {
        if(l > r) return null;
        if(l == r) return lists[l];
        int m = (l+r)/2;
        ListNode left = mergeSort(lists,l,m);
        ListNode right = mergeSort(lists,m+1,r);

        return merge(left, right);
    }

    public ListNode merge(ListNode left, ListNode right) {
        ListNode head = new ListNode();
        ListNode curr = head;

        while(left != null && right != null) {
            if(left.val <= right.val) {
                curr.next = left;
                left = left.next;
            } else {
                curr.next = right;
                right = right.next;
            }
            curr = curr.next;
        }

        if(left != null) {
            curr.next = left;
        } else {
            curr.next = right;
        }
        return head.next; 
    }
}
