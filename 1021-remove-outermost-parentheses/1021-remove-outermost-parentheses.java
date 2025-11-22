class Solution {
    public String removeOuterParentheses(String s) {
           int count  = 0;
           char[] st = s.toCharArray();
           StringBuilder ss = new StringBuilder();
           for(int i = 0 ; i < st.length;i++)
           {
            if(st[i] == '(')
            {
                if(i!=0 && count > 0)
                {
                      ss.append(st[i]);
                }

                count++;
            }
            else if(st[i] ==')')
            {
                count--;
                if(i != 0 && count > 0)
                {
                    ss.append(st[i]);
                }
            }
           }

           return ss.toString();
    }
}