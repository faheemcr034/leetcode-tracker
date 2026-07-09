# Last updated: 09/07/2026, 10:08:37
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words = s.split()
        if len(words) != len(pattern):
            return False
        
        h = {}
        m = {}
        for p,w in zip(pattern,words):
            if p in h:
                if h[p] != w:
                    return False
            else:
                h[p] = w

            if w in m:
                if m[w] != p:
                    return False    

            else:
                m[w] = p        

        return True     