class Solution {
    public int[] rearrangeArray(int[] nums) {
       int n = nums.length;
        int[] res=new int[n] ;
        int k =0;
        int j =1 ;
      
      for(int i =0 ;i<n ;i++)
      {
        if(nums[i]>=0)
        {
          res[k]=nums[i];
          k=k+2;  
        }
        else{
            res[j]=nums[i];
            j=j+2;
        }
      }
      
      return res;
    }
}