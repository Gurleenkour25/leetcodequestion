class Solution {
    public String sortVowels(String s) {
        ArrayList<Character> arr = new ArrayList<>();
        String vowel = "AEIOUaeiou";

        for(char c : s.toCharArray())
        {
            if(vowel.indexOf(c)!=-1)
            {
                arr.add(c);
            }
        }

        Collections.sort(arr);
        
        char[] ss = s.toCharArray();
         int j =0;
        for(int i =0 ;i<ss.length ; i++)
        {
            if(vowel.indexOf(ss[i]) != -1)
            {
                  ss[i] = arr.get(j);
                  j++;
            }
        }
          
          return new String(ss);
    }
}