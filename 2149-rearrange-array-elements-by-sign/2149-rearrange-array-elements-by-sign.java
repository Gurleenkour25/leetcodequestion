class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int k=0;
        int j = 1;
    for(int i =0; i<n ;i++) {
        if(nums[i] >= 0 ){
            arr[k]= nums[i];
             k += 2;
        }
        else{
            arr[j] = nums[i];
             j += 2;
        }
    
       
    } 

      return arr;
    }
}