class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        //finding the max k
        for(int pile : piles) {
            if (pile > max) {
                max = pile;
            }
        }

        int low = 1;
        int high = max;
        int res = max;

        while(low <= high) {
            int mid = low + (high-low)/2;
            if(isGood(piles,mid,h)) {
                res = mid;
                high = mid -1;
            } else {
                low = mid + 1;

            }
        }
        return res;    
    }

    public boolean isGood(int[] piles, int k, int h) {
        int sum = 0;
        for(int pile : piles) {
            if(pile%k != 0) {
                sum += pile/k + 1;
            } else sum += pile/k;
        }
        return sum <= h;

    }
}
