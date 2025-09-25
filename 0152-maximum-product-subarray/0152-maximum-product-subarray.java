class Solution {
    public int maxProduct(int[] arr) {
        int n = arr.length;
        
        int product = 1;
        int res = arr[0];

        for(int i = 0 ; i < n ; i++)
        {
            product = 1;
           
            for(int j = i ;j<n ;j++)
           {
                product = product*arr[j];
                 res = Math.max(res,product);
           }
           
        }

        return res;
    }
}