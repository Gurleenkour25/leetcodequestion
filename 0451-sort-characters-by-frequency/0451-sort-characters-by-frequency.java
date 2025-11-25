class Solution {
    public String frequencySort(String s) {
      Map<Character,Integer> map = new HashMap<>();
      for(char ch : s.toCharArray()) 
      {
        map.put(ch,map.getOrDefault(ch,0)+1);
      } 
      ArrayList<Character> arr = new ArrayList<>(map.keySet());
      arr.sort((a,b)->(map.get(b)-map.get(a)));

StringBuilder str = new StringBuilder();
      for(char ch : arr)
      {
        int count = map.get(ch);
        while (count != 0)
        {
            str.append(ch);
            count--;
        }
      } 

      return str.toString();
    }
}