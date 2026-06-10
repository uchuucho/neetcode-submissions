class Pair:
    def __init__(self, key: int, value: int):
        self.key = key
        self.value = value

class Solution:
    def quickSort(self, dist: List[Pair], s: int, e: int, k: int) -> List[Pair]:
        if e - s + 1 <= 1:
            return dist
        
        pivot = dist[e]
        loc = s
        for i in range(s, e):
            if dist[i].value < pivot.value:
                dist[loc], dist[i] = dist[i], dist[loc]
                loc += 1
        
        dist[e] = dist[loc]
        dist[loc] = pivot
        if loc == k:
            return
        elif loc < k:
            self.quickSort(dist, loc + 1, e, k)
        else:
            self.quickSort(dist, s, loc - 1, k)
        return dist

    def kClosest(self, points: List[List[int]], k: int) -> List[List[int]]:
        n = len(points)
        dist = [ Pair(i, points[i][0] * points[i][0] + points[i][1] * points[i][1]) for i in range(len(points))]
        self.quickSort(dist, 0, n - 1, k)
        return [points[p.key] for p in dist[:k]]
        
        

        