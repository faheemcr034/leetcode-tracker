// Last updated: 23/07/2026, 22:26:00
1class Solution {
2    
3    public boolean possible(int m,int n,int[] quantities){
4        int supplied = 0;
5        for(int i = 0;i<quantities.length;i++){
6            supplied += (int)Math.ceil((double) quantities[i] / m);        }
7        return supplied<=n;
8    }
9    
10    public int minimizedMaximum(int n, int[] quantities) {
11        int l = 1;
12        int max = 0;
13        for(int q : quantities){
14            max = Math.max(q,max);
15        }
16        int r = max;
17        int ans = Integer.MAX_VALUE;;
18        while(l<=r){
19            int mid = l + (r-l)/2;
20            if(possible(mid,n,quantities)){
21                ans = mid;
22                r = mid - 1;
23            }
24            else l = mid + 1;
25        }
26        return ans;
27    }
28}