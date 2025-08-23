class Solution {
    public int missingNumber(int[] arr) {
        Arrays.sort(arr);
        for(int i = 0 ; i < arr.length ; i++)
         {
            if(i != arr[i]) {
                return i;
            }
         }

         return arr.length;
    }
}