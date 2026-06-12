class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        for row in range(len(matrix)):
            low = 0
            high = len(matrix[0]) - 1
            while low <= high:
                mid = (low + high) // 2
                if matrix[row][mid] > target:
                    high = mid - 1
                elif matrix[row][mid] < target:
                    low = mid + 1
                else:
                    return True
        return False

        