# Last updated: 09/07/2026, 10:06:35
class Solution:
    def timeRequiredToBuy(self, tickets: List[int], k: int) -> int:
        seconds = 0
        queue = [(i, tickets[i]) for i in range(len(tickets))]
        while queue:
            i,t = queue.pop(0)
            seconds += 1
            t -= 1
            if t==0 and i==k:
                return seconds 
            if t>0:
                queue.append((i,t))


   
            

        