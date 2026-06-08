class Solution:
    def calPoints(self, operations: List[str]) -> int:
        record = []
        for s in operations:
            if s != "+" and s != "D" and s != "C":
                record.append(int(s))
            elif s == "C":
                record.pop()
            elif s == "D":
                record.append(record[-1] * 2)
            else:
                record.append(record[-1] + record[-2])
        return sum(record)


        