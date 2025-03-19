## Problem1: Longest Increasing Subsequence (https://leetcode.com/problems/longest-increasing-subsequence/)


Time Complexity : O(n^2)
Sapce Complexity : O(n)
class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums== null || nums.length==0){
            return 0;
        }
        int n = nums.length;
        int max = 1;
        int[] dp = new int[n];
        Arrays.fill(dp,1);
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[j] < nums[i]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
            max=Math.max(max,dp[i]);
        }
        return max;
    }
}