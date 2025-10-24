class Solution {
    public String intToRoman(int num) {
       final int[] value  = {1000,900,500,400,100,90,50,40,10,9,5,4,1}; 
       final String[] roman ={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};


      StringBuilder st = new StringBuilder();
       for(int i = 0 ; num > 0 ; i++)
       {
        while(num >= value[i])
        {
            st.append(roman[i]);
            num = num - value[i];
        }
       }

       return st.toString();
     }
}