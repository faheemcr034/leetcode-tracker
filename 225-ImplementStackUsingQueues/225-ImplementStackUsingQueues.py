# Last updated: 09/07/2026, 10:08:56
class MyStack:

    def __init__(self):
        self.items = []

    def push(self, x: int) -> None:
        self.items.append(x)


    def pop(self) -> int:
        return self.items.pop() if not self.empty() else None


    def top(self) -> int:
        return self.items[-1] if not self.empty() else None
        

    def empty(self) -> bool:
          return len(self.items) == 0

        


# Your MyStack object will be instantiated and called as such:
# obj = MyStack()
# obj.push(x)
# param_2 = obj.pop()
# param_3 = obj.top()
# param_4 = obj.empty()