//https://leetcode.com/problems/max-consecutive-ones-iii/
class Solution {
    public int longestOnes(int[] nums, int k) {
        int zeros = 0;
        int maxLen = 0;
        int n = nums.length;
        // for(int i = 0; i<n; i++){
        //     zeros = 0;
        //     for(int j = i; j < n; j++){
        //         if(nums[j] == 0) zeros++;
        //         if(zeros <= k){
        //             int length = j-i+1;
        //             maxLen = Math.max(maxLen, length);
        //         }
        //         else break;
        //     }
        // }

        //optimal approach
        int l = 0, r = 0;
        while(r < n){
            if(nums[r] == 0) zeros++;
            if(zeros > k){
                if(nums[l] == 0) --zeros;
                l++;
            }
            else{
                int length = r-l+1;
                maxLen = Math.max(maxLen, length);
            }
            r++;
        }
        return maxLen;
    }
}
