class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , ArrayList<String>> map = new HashMap<>();
        for(int i =0;i<strs.length;i++)
        {
            String word = strs[i];
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);
            if(!map.containsKey(sorted))
            {
                map.put(sorted,new ArrayList<String>());
            }
            map.get(sorted).add(word);
        }
        return new ArrayList<>(map.values());
        
    }
}