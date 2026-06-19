class Solution {
    // TC-> O(n) SC-> O(n)
    public int[] shuffle(int[] nums, int n) {
        int len = nums.length;
        int[] ans = new int[len];
        int le=0, ri=n;
        boolean marker = true;
        for(int i=0; i<len; i++){
            if(marker){
                ans[i] = nums[le++];
                marker = false;
            }else{
                ans[i] = nums[ri++];
                marker = true;
            }
        }
        return ans;
    }
}