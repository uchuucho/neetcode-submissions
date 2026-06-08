class Solution:
    def isValid(self, s: str) -> bool:
        our_stack = []
        mapping = {")": "(", "}" : "{", "]": "["}
        for c in s:
            if c in mapping:
                if not our_stack or our_stack[-1] != mapping[c]:
                    return False
                our_stack.pop()
            else:
                our_stack.append(c)
        return len(our_stack) == 0
            


        