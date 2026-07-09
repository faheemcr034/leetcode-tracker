# Last updated: 09/07/2026, 10:07:53
class Solution:
    def licenseKeyFormatting(self, s: str, k: int) -> str:
        s = "".join(s.split("-"))
        clean = s.upper()
        group = []
        temp = ""
        for i in range(len(clean)-1,-1,-1):
            temp = clean[i] + temp
            if len(temp) == k:
                group.append(temp)
                temp = ""
        if temp:
            group.append(temp)
        group.reverse()  
        return "-".join(group)          