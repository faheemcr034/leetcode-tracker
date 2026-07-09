# Last updated: 09/07/2026, 10:06:36
class Solution:
    def reversePrefix(self, word: str, ch: str) -> str:
        result = ""
        for i in range(len(word)):
            if ch not in word:
                return word
            if word[i] == ch:
                p1 = word[:i+1][::-1]
                p2 =  word[i+1::]                 
                result = p1 + p2
                break
        return result