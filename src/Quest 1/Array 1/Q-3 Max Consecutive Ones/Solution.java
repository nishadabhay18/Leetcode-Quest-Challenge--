class Solution {
    // TC-> O(n) SC-> O(1)
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int ones = 0, maxOnes = 0;
        for(int i=0; i<n; i++){
            if(nums[i] == 1){
                ones++;
                maxOnes = Math.max(maxOnes, ones);
            }
            else ones=0;
        }
        return maxOnes;
    }

    // Using Sliding Window. TC-> O(n) SC-> O(1)
    public int findMaxConsecutiveOnes(int[] nums){
        int n = nums.length;
        int left = 0, ans = -1, window = 0;
        for(int right=0; right<n; right++){
            // add element nums[right] to window.
            window += nums[right];
            // while condition not met, do some logic to remove nums[left] and left++.
            while(right-left+1 != window){
                window -= nums[left];
                left++;
            }
            // update the answer.
            ans = Math.max(ans, right-left+1);
        }
        return ans;
    }
}