class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k=k%n;
     reverse(nums,0,n-1);
     reverse(nums,0,k-1);
     reverse(nums,k,n-1);
        
    }

    public static void reverse(int[] arr,int start,int end)
    { 
        int n=arr.length;
        int i = start;
        int j = end;
        while(i<j){
            int temp = arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            i++;
            j--;
        }


    }
}