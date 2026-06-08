class Solution {
    public void sortColors(int[] nums) {
        int[] counts = {0,0,0};
        for(int num : nums) {
            counts[num]++;
        }

        int n = counts.length;
        int k = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < counts[i]; j++) {
                nums[k] = i;
                k++;
            }
        }
        
    }
}