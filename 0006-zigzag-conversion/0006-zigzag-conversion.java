class Solution {
    public String convert(String s, int numRows) {
        StringBuilder[] str = new StringBuilder[numRows];

        if(numRows == 1) {
            return s;
        }

        for(int i = 0 ;i<numRows ;i++)
        {
            str[i] = new StringBuilder();
        } 

        int curri = 0;
        boolean goingdown = false;


        for(char c : s.toCharArray()) 
        {
            str[curri].append(c) ;

            if(curri == 0 || curri == numRows-1) {
                goingdown = !goingdown;
            }

            curri += goingdown?1:-1;
        }

   StringBuilder res = new StringBuilder();
        for(int i = 0 ;i<numRows ; i++) {
            res.append(str[i]);
        }
        
        return res.toString();
    }
}