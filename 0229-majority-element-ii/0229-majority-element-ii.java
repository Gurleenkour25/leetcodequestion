class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int cal = n/3;
        Arrays.sort(nums);
        ArrayList<Integer> arr = new ArrayList<>();
        int count = 1;
        for(int i =1 ; i<n ;i++)
        {
            if(nums[i] == nums[i-1])
            {
                count++;
            }
            else{
                if(count > cal)
                {
                    arr.add(nums[i-1]);
                }

                count = 1;
            }
        }

        if(count > n/3)
        {
            arr.add(nums[n-1]);
        }

        return arr;

    }
}