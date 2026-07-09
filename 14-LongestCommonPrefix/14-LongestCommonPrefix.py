# Last updated: 09/07/2026, 10:11:15
class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        prefix = strs[0]
        for s in range(1,len(strs)):
            while not strs[s].startswith(prefix):
                prefix = prefix[:-1]
                
                
        return prefix        
            
        
            
           
        