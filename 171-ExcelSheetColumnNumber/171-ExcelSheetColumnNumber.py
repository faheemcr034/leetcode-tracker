# Last updated: 09/07/2026, 10:09:16
class Solution:
    def titleToNumber(self, columnTitle: str) -> int:
        result = 0
        for i in range(len(columnTitle)):
            val = ord(columnTitle[i]) - ord("A") + 1
            result = result * 26 + val
        return result
