class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int maxi = 0 ;
        int lp =0 ;
        int rp = n-1;

        while(lp < rp) {
            int width = rp-lp;
            int h = Math.min(height[lp],height[rp]);
            int  currarea = width*h;
            maxi = Math.max(maxi,currarea);

           while(lp<rp && height[lp]<=h) lp++;
            while(lp<rp && height[rp]<=h) rp--;
        }

        return maxi;
    }
}