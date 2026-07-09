# Last updated: 09/07/2026, 10:06:43
class Solution:
    def minOperations(self, logs: List[str]) -> int:
        stack = []
        for i in range(len(logs)):
            if logs[i] != "../" and logs[i] != "./":
                stack.append(i)
            else:
                if logs[i] == './':
                    continue 
                if stack and logs[i] == "../":
                    stack.pop()
                  
        return len(stack)       

            