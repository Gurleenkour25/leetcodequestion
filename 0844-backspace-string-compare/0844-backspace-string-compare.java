class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder str = new StringBuilder();
        StringBuilder str1 = new StringBuilder();

        for(char c: s.toCharArray())
        {
            if(c != '#')
            {
                str.append(c);
            }
            else if(c== '#')
            {
                if(str.length() > 0)
                str.deleteCharAt(str.length() -1);
            }
        }


        for(char c: t.toCharArray())
        {
            if(c != '#')
            {
                str1.append(c);
            }
            else if(c=='#')
            {
                  if(str1.length() > 0)
                str1.deleteCharAt(str1.length() -1);
            }
        }

        if(str.toString().equals(str1.toString()))
        {
            return true;
        }

        return false;
    }
}