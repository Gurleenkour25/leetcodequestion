class Solution {
    public int trap(int[] height) {
     int n = height.length;
     int res=0;
     int lmax=0;
     int rmax=0;
    int i=0;
    int j=n-1;
     while(i<j)
     {
        lmax=Math.max(lmax,height[i]);
        rmax= Math.max(rmax,height[j]);
        if(lmax<rmax)
        {
        res += Math.min(lmax,rmax)-height[i];
        i++;

        }
        else{
           res += Math.min(lmax,rmax)-height[j] ;
           j--;
        }
     }   

     return res;
    }
}