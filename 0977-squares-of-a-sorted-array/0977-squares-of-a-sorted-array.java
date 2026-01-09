class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int i = 0;
        int j = n - 1;

        for(int k = n-1; k >= 0 ; k-- ) {
            int firstsq = nums[i] * nums[i];
            int secondsq = nums[j] * nums[j];

            if(secondsq >= firstsq){
                arr[k] = secondsq;
                 j--;
            }
            
            else if (firstsq > secondsq){
                arr[k] = firstsq;
                i++;
            }
        }
          
          return arr;
    }
}