class Solution {
    // TC-> O(n) SC-> O(n)
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        while(i < n){
            int correct = nums[i]-1;
            if(nums[correct] == nums[i]) i++;
            else swap(nums, correct, i);
        }
        for(int k=0; k<n; k++){
            if(nums[k] != k+1) ans.add(k+1);
        }
        return ans;
    }
    public void swap(int[]arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}