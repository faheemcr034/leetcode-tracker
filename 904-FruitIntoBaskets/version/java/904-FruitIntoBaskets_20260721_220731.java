// Last updated: 21/07/2026, 22:07:31
1class Solution {
2    public int totalFruit(int[] fruits) {
3        int i = 0;
4        int max = 0;
5        HashMap<Integer,Integer> map = new HashMap<>();
6        for(int j = 0;j<fruits.length;j++){
7            map.put(fruits[j],map.getOrDefault(fruits[j],0) + 1);
8        while(map.size()>2){
9            map.put(fruits[i],map.get(fruits[i]) - 1);
10            if(map.get(fruits[i])<1) map.remove(fruits[i]);
11            i++;
12        }
13        
14        max = Math.max(j - i + 1,max);
15        }
16        return max;
17    }
18}