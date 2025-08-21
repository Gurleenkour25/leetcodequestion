class Solution {
    public boolean checkPerfectNumber(int n) {
        if(n==1){
            return false;
        }
        int sum =1 ;
        for(int i = 2 ;i<=(int)Math.sqrt(n) ; i++) {
            if(n%i == 0) {
                sum = sum + i + (n/i);
            }
        }
        
        if(sum == n) {
            return true;
        }

        return false;
    }
}