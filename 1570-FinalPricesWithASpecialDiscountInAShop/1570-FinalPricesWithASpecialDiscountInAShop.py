# Last updated: 09/07/2026, 10:06:51
class Solution:
    def finalPrices(self, prices: List[int]) -> List[int]:
        stack = []
        answer = prices[:]
        for i in range(len(prices)):
            while stack and prices[i] <= prices[stack[-1]]:
                k = stack.pop()
                answer[k] = prices[k] - prices[i]
            stack.append(i)
        return answer     


        