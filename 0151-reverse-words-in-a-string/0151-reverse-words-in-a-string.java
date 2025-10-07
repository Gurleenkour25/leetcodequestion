class Solution {
    public String reverseWords(String s) {
        s= s.trim().replaceAll("\\s+"," ");
        String[] ss = s.split(" ");

        int n = ss.length;
        int i =0 ,j = n-1;

        while(i < j)
        {
            String temp = ss[i];
            ss[i] = ss[j];
            ss[j] = temp;
            i++;
            j--;
        }
        
        String st = String.join(" ",ss);
        return st;
    }
}