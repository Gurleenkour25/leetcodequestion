class Solution {
    public int findMaxLength(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();
        int sum =0;
        int maxi = 0;
        map.put(0,-1);
        for(int i = 0 ; i< nums.length; i++)
        {
            if(nums[i] == 0)
            {
                sum +=-1;
            }
            else{
                sum += 1;
            }
        

        if(map.containsKey(sum))
        {
            maxi = Math.max(maxi , i-map.get(sum));
        }
        else{
            map.put(sum,i);
           }
        }
        return maxi;
        
    }

    
}