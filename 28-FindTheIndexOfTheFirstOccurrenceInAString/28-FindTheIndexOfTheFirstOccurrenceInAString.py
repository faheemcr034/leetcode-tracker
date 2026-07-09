# Last updated: 09/07/2026, 10:10:56
class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        for i in range(len(haystack) - len(needle) + 1):
            for j in range(len(needle)):
                if not haystack[i+j] == needle[j]:
                    break
            else:
                return i
        return -1


        