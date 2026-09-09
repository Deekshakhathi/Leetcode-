class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans=new int[nums.length];
        Arrays.fill(ans, 1);
       int l=1;
       int r=1;
       for(int i=0;i<nums.length;i++){
         ans[i]= ans[i]*l;
         l=l*nums[i];

         int j=nums.length-1-i;
        ans[j]= ans[j]*r;
         r=r*nums[j];
       }
    return ans;
    }
}