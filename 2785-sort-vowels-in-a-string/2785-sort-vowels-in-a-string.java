class Solution {
    public String sortVowels(String s) {
        char []ch = s.toCharArray();
        int n = ch.length;
        String vowel ="aeiouAEIOU";
        ArrayList<Character> c = new ArrayList<>();
        for(int i = 0 ;i < n ;i++ ) {
            if(vowel.indexOf(ch[i])!=-1)
            {
                c.add(ch[i]);
            }
        }

        Collections.sort(c);
        int j =0;

        for(int i = 0 ;i <n; i++) {
           if(vowel.indexOf(ch[i])!=-1) 
           {
             ch[i]=c.get(j);
             j++;
           }
        }
        
        return new String(ch);
    }
}