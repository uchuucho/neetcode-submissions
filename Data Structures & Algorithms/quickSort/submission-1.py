# Definition for a pair.
# class Pair:
#     def __init__(self, key: int, value: str):
#         self.key = key
#         self.value = value
class Solution:
    def quickSort_helper(self, pairs: List[Pair] , s: int, e: int) -> List[Pair]:
        if e - s + 1 <= 1:
            return pairs

        pivot = pairs[e]
        loc = s

        for i in range(s, e):
            if pairs[i].key < pivot.key:
                pairs[i], pairs[loc] = pairs[loc], pairs[i]
                loc += 1

        pairs[e] = pairs[loc]
        pairs[loc] = pivot
        self.quickSort_helper(pairs, s, loc - 1)
        self.quickSort_helper(pairs, loc + 1, e)

        return pairs

    def quickSort(self, pairs: List[Pair]) -> List[Pair]:
        return self.quickSort_helper(pairs, 0, len(pairs) - 1)