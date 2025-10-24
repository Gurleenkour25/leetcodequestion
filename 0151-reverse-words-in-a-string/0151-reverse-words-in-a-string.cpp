#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

class Solution {
public:
 
    void reverse(int start, int end, string &s) {
        while (start < end) {
            swap(s[start], s[end]);
            start++;
            end--;
        }
    }

    string reverseWords(string s) {
        int n=s.size();
        int i=0;
        int j=0;

    while(i<n && s[i]==' '){
        i++;
    }

while(i<n){
    while(i<n && s[i]!=' '){
        s[j++]=s[i++];
        
       
     }
     while(i<n && s[i]==' '){
        i++;
     }

     if(i<n){
        s[j++]=' ';
     }
}

s.resize(j);

reverse(0,j-1,s);
int start=0;
for(int i=0;i<=j;i++){
    if(i==j||s[i]==' '){
        reverse(start,i-1,s);
        start=i+1;
      }
      
}

  return s;      
    }
};

