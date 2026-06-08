class Solution {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        int l = 0;
        int r = 0;

        while(r < len) {
            while(r < len && nums[r] != val) {
                nums[l] = nums[r];
                l++;
                r++;
            }
            r++;
            
            
        }

        return l;
    }
}