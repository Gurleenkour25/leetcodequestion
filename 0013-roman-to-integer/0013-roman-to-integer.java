class Solution {
    public int romanToInt(String s) {
     Map<Character,Integer> map = new HashMap<>();
     map.put('I',1);  
     map.put('V',5);  
    map.put('X',10);
    map.put('L',50);
     map.put('C',100);
     map.put('D',500);
    map.put('M',1000);
    
   int number = 0;
    char[] arr = s.toCharArray();

    for(int i =0 ; i<arr.length ; i++)
    {
       int value = map.get(arr[i]);
       if(i+1 < arr.length  && value < map.get(arr[i+1]))
       {
         number -= value;
       }
       else {
        number += value;
       }

    }
       return number;
    }

}