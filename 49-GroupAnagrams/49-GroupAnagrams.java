// Last updated: 09/07/2026, 10:10:30
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s : strs){
           char[] arr = s.toCharArray();
           Arrays.sort(arr);
           String sorted_s = new String(arr);
           if(map.containsKey(sorted_s)){
                map.get(sorted_s).add(s);
           }
           else{
            List<String> list = new ArrayList<>();
            list.add(s);
            map.put(sorted_s,list);
           }
        }
        return new ArrayList<>(map.values());
    }
}