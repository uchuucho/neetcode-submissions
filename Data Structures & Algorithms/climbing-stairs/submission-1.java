class Solution {
    public int climbStairs(int n) {
        return helper(n, 0);
        
    }

    public int helper(int finalStep, int currentStep){
        if(currentStep >= finalStep) return currentStep == finalStep? 1 : 0;
        return helper(finalStep, currentStep + 1) + helper(finalStep, currentStep + 2);
    }

    
}
