class Solution {
    public int romanToInt(String s) {
        int pre = 0;
        int num =0;
        int n = s.length();
        for(int i = n-1 ; i >= 0 ; i--) {
           
             int value = switch(s.charAt(i))
             {
                case 'I'-> 1;
                case 'V'-> 5;
                case 'X'-> 10;
                case 'L'-> 50;
                case 'C'->100;
                case 'D'-> 500;
                case 'M'-> 1000;
                default -> 0;
             };

             if(value < pre)
             {
               num = num - value;
             }

             else {
                num = num + value;
             }

             pre = value;
        }

        return num;
    }
}