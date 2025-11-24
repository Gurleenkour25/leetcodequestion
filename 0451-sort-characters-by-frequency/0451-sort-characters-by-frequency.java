class Solution {
    public String frequencySort(String s) {
      int[] freq = new int[256];

      for(char ch : s.toCharArray())
      {
          freq[ch]++;
      }  

     PriorityQueue<Character> pq = new PriorityQueue<>( (a, b) -> freq[b] - freq[a]);

       
       for(int i = 0 ; i < 256 ; i++)
       {
           if(freq[i] > 0)
           {
             pq.add((char)i);
           }
       }

       StringBuilder str = new StringBuilder();

      while(!pq.isEmpty()) {
        char ch = pq.poll();
        int count = freq[ch];

        for(int i = 0 ; i < count ; i++) 
        {
            str.append(ch);
        }
      }


        return str.toString();
    }
}