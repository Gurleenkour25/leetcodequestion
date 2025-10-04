class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
      ArrayList<Integer> arr = new ArrayList<>();
      HashSet<Integer> set = new HashSet<>();

      for(int i : nums1)
      {
         set.add(i);
      }

      for(int i : nums2)
      {
        if(set.contains(i))
        {
            if(arr.isEmpty() || !arr.contains(i))
            {
                arr.add(i);
            }
        }
      } 
      int n = arr.size();

      int[] arr2 = new int[n];

      for(int i =0 ;i<n ;i++)
      {
        arr2[i] = arr.get(i);
      } 

      return arr2;
    }
}