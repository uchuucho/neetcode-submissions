# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:    
    def mergeKLists(self, lists: List[Optional[ListNode]]) -> Optional[ListNode]:
        n = len(lists)
        res_head = ListNode()
        curr = res_head

        while True:
            min_i = -1
            for i in range(n):
                if lists[i] is None:
                    continue
                if min_i == -1 or lists[i].val < lists[min_i].val:
                    min_i = i

            if min_i == -1:
                break

            curr.next = lists[min_i]
            curr = curr.next
            lists[min_i] = lists[min_i].next

        return res_head.next 
        