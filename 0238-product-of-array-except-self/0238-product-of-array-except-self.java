class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
     int[] arr = new int[n];
     //int[] pre = new int [n];
     int suff = 1;
      arr[0]=1;
    

     for(int i = 1 ;i<n ;i++)
     {
        arr[i] = arr[i-1]*nums[i-1];
     }
    
    for(int i = n-2 ;i>=0 ;i--)
    {
        suff = nums[i+1]*suff;
        arr[i]= suff * arr[i];
    }

     return arr;

    }
}