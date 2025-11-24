class Solution {
    public String frequencySort(String s) {
        
        int[] freq = new int[256];
        for(char c:s.toCharArray()) {
            freq[c]++;
        }

        PriorityQueue<Character> pp = new PriorityQueue<>((a,b)->(freq[b]-freq[a]));

        for(int i = 0 ; i < 256 ; i++)
        {
            if(freq[i] > 0)
            {
                pp.add((char)i);

            }
        }

StringBuilder str = new StringBuilder();
        while(!pp.isEmpty()) {
            char ch = pp.poll();
            int count = freq[ch];

            while(count != 0)
            {
                str.append(ch);
                count--;
            }
        }

        return str.toString();
    }
}