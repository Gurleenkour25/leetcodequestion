class Solution {
    public String reverseWords(String s) {
      s= s.trim().replaceAll("\\s+"," ");
     String[] temp = s.split(" ");

     int i = 0 ; 
     int j = temp.length-1;
     while(i < j)
     {
        String t = temp[i];
        temp[i] = temp[j];
        temp[j] = t;
        i++;
        j--;
     }

     return String.join(" ",temp);
    }
}