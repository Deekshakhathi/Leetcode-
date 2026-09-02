class Solution {
    public int romanToInt(String s){
      int ans=0;
      for(int i=0;i<s.length();i++){
        int c=formula(s.charAt(i));
        if(i<s.length()-1 && c<formula(s.charAt(i+1))){
            ans-=c;
        }else{
            ans+=c;
        }
      }
    return ans;
      
    }
      public int formula(char m){
        if (m=='I'){ 
            return 1;
        }
        if (m=='V'){
             return 5;
        } 
        if (m=='X'){
            return 10;
        } 
        if (m=='L') {
            return 50;
        }
        if (m=='C') {
            return 100;
        }
        if (m=='D'){
            return 500;
        }
        if (m=='M' ){
            return 1000;
        }
        return 0;
      }
    
}