class Solution {
    public int findMin(int[] nums) {
        int end=nums.length;
        int mini=nums[0];
        for(int i=1;i<end;i++){
            if(nums[i]<mini){
                mini=nums[i];
            }
        }
        return mini;
    
    }
}