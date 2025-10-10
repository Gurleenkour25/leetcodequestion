class Solution {
    public String reorganizeString(String s) {
      int[] count = new int[26];
      char[] arr = s.toCharArray();
      int n = arr.length;
      for(char c : arr)
      {
        count[c-'a']++;
      }

      int maxi = 0;
      int maxchar = 0;

      for(int i = 0 ;i<26 ;i++)
      {
        if(count[i]>maxi)
        {
            maxi = count[i];
            maxchar = i;
        }
      }

      if(maxi > (n+1)/2)
      {
        return "";
      }

      int index = 0;
      char[] arr2 = new char[n];

      while(count[maxchar]>0)
      {
        arr2[index] = (char) (maxchar + 'a');

        index = index + 2 ;
        count[maxchar]--;
      }

      for(int i =0 ;i<26 ;i++)
      {
        while(count[i]>0)
        {
            if(index>=n)
            {
                index =1;
            }

            arr2[index]= (char) (i+'a');
            index = index+2;
            count[i]--;
        }
      }
       
       return new String(arr2);
    }
}