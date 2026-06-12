class Solution:
    def sortColors(self, nums: List[int]) -> None:
        colors = [0, 0, 0]
        for num in nums:
            colors[num] += 1
        k = 0
        for i in range(len(colors)):
            for j in range(colors[i]):
                nums[k] = i
                k+=1
        
        