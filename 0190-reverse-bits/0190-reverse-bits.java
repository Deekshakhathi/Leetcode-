class Solution {
    public int reverseBits(int n) {
        String c=Integer.toBinaryString(n);
        while (c.length() < 32) {
            c = "0" + c;
        }
        String rev="";
        for(int i=c.length()-1;i>=0;i--){
             rev=rev+c.charAt(i);
        } 
        int a = Integer.parseUnsignedInt(rev,2);
    return a;
    }
    
}