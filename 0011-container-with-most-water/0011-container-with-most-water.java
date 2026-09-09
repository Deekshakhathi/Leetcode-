class Solution {
    public int maxArea(int[] height) {
        int start=0;
        int end=height.length-1;
        int ans=0;
        int fin=0;
     while(start<end){
            int max=height[start];
            int min=height[end];
             ans=Math.min(max,min);
             fin=Math.max(fin,ans * (end-start));

          if(height[start]<height[end]){
            start++;
          }else{
            end--;
          }
        }
        return fin;
    }
}