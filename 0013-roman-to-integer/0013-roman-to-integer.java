class Solution {
    public int romanToInt(String s) {
        int n = s.length();
        int prev = 0 ;
        int number = 0;

        for(int i = n-1 ; i>=0 ; i--)
        {
           int value= switch(s.charAt(i))
            {
                case 'I'-> 1;
               
                case 'V'-> 5;
               
                case 'X'-> 10;
              
                case 'L'-> 50;
             
                case 'C'-> 100;
           
                case 'D'->500;
        
                case 'M'->1000;
      
                default-> 0;
           
            };
           if(value < prev)
           {
             number -= value;
           }
           else 
           {
             number += value;
           }

           prev = value;
        }

        return number;
    }
}