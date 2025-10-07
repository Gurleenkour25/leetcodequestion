class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)
        {
            return("");
        }
        String prefix = strs[0];
        for(int i = 1; i<strs.length; i++)
        {
           while(!strs[i].startsWith(prefix))
           {
            int k = prefix.length();
             prefix = prefix.substring(0,k-1);
           }
        }

        if(prefix.length()==0)
        {
            return "";
        }

        return prefix;
    }
}