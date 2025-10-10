class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        char[] arr = blocks.toCharArray();
         int white =0;
        for(int i =0; i<k;i++)
        {
            if(arr[i]=='W')
            {
                white++;
            }
        }

         int mini = white;

         for(int i = k ; i<n ;i++)
         {
            if(arr[i-k]=='W')
            {
                white--;
            }
            if(arr[i] == 'W')
            {
                white++;
            }
            mini = Math.min(mini,white);
         }
      
      return mini;
         
    }
}