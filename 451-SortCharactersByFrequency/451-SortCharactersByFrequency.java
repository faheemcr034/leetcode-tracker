// Last updated: 09/07/2026, 10:07:57
class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0) + 1);
        }
        PriorityQueue<Map.Entry<Character,Integer>> pq =
        new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            pq.add(entry);
        }
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
            Map.Entry<Character,Integer> entry = pq.poll();
            char ch = entry.getKey();
            int freq = entry.getValue();
            for(int i = 0;i<freq;i++){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}