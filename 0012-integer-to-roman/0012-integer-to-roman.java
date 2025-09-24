class Solution {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        converter(sb,num/1000,'M','*','*');
        num = num%1000;

        converter(sb,num/100,'C','D','M');
        num = num % 100;

        converter(sb,num/10,'X','L','C');
        num = num % 10;
        
        converter(sb,num,'I','V','X');
        
        return sb.toString();
    }

    public void converter(StringBuilder sb,int val , char minor, char mid ,char major)
    {
        if(val >=1 && val <= 3)
        {
            for(int i =1 ;i<=val ; i++)
            {
                sb.append(minor);
            }
        }
        else if (val == 4)
        {
            sb.append(minor);
            sb.append(mid);
        }

        else if (val == 5)
        {
        
            sb.append(mid);
        }

        else if (val >=6 && val <=8)
        {
            
            sb.append(mid);
            for(int i =6 ;i<=val ;i++)
            {
                sb.append(minor);
            }
        }


      else if (val == 9)
        {
        
            sb.append(minor);
            sb.append(major);
        }


    }
}