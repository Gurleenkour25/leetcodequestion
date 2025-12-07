class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> map  = new LinkedHashMap<>();
         char c=' ';
        for(char k : s.toCharArray())
        {
            map.put(k,map.getOrDefault(k,0)+1);
        }

        for(Map.Entry<Character,Integer> mm : map.entrySet())
        {
            if(mm.getValue() == 1)
            {
               
                 return s.indexOf(mm.getKey());
            }
        }

        return -1;
    }
}