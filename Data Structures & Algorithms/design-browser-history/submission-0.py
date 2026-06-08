class Node:
    def __init__(self, url: str):
        self.url = url
        self.prev = None
        self.nxt = None

class BrowserHistory:

    def __init__(self, homepage: str):
        self.curr = Node(homepage)
        

    def visit(self, url: str) -> None:
        node = Node(url)
        node.prev = self.curr
        self.curr.nxt = node
        self.curr = node
        

    def back(self, steps: int) -> str:
        i = 0
        while i < steps and self.curr.prev:
            self.curr = self.curr.prev
            i += 1
        return self.curr.url
        

    def forward(self, steps: int) -> str:
        i = 0
        while i < steps and self.curr.nxt:
            self.curr = self.curr.nxt
            i += 1
        return self.curr.url
        


# Your BrowserHistory object will be instantiated and called as such:
# obj = BrowserHistory(homepage)
# obj.visit(url)
# param_2 = obj.back(steps)
# param_3 = obj.forward(steps)