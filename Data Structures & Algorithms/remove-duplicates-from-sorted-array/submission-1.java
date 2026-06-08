class Solution {
    public int removeDuplicates(int[] nums) {
        int l = 0;
        int r = 0;
        int len= nums.length;
        while(r < len) {
            nums[l] = nums[r];
            while(r < len && nums[r] == nums[l]) {
                r++;
            }
            l++;
        }

        return l;
        
    }

    
}