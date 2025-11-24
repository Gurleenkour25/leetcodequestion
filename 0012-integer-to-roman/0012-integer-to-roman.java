class Solution {
     public static final String[] roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    public static final int[] value = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    public String intToRoman(int num) {
        StringBuilder str = new StringBuilder();
        for(int i = 0 ; i < value.length ; i++) {
            while(num >= value[i])
            {
        
                str.append(roman[i]);
                num = num - value[i];
                
            }
        }

        return str.toString();
    }
}