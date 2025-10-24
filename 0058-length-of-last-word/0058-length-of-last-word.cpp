class Solution {
public:
    int lengthOfLastWord(string s) {
        int n=s.size();
        if(n==0||n==1){
            return n;
        }
        int count=0;
        bool ele=false;

        for(int i=n-1;i>=0;i--)
        {
          
            if(s[i]!=' ')
            {
                count++;
                ele=true;
                
            }
            else if(ele){
                return count;
            }

        }
       return count; 
    }

};