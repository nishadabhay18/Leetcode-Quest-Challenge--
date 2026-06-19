class Solution {
    // TC-> O(n) SC-> O(2) or constant space
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int i = 0;
        int[] arr = new int[2];
        while(i < n){
            int correct = nums[i]-1;
            if(nums[i] == nums[correct]) i++;
            else swap(nums, i, correct);
        }
        for(int j=0; j<n; j++){
            if(nums[j] != j+1){
                arr[0] = nums[j];
                arr[1] = j+1;
            }
        }
        return arr;
    }
    public void swap(int[]arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}