//https://leetcode.com/problems/majority-element/submissions/1156661434/
class Solution {
    public int majorityElement(int[] nums) {
        int c = 0;
        int count = 0;
        int ele = 0;
        for(int i = 0; i < nums.length; i++){
            if(count == 0){
                count = 1;
                ele = nums[i];
            }
            else if(nums[i] == ele){
                count++;
            }
            else count--;
        }

        for(int i = 0; i<nums.length; i++){
            if(nums[i] == ele) c++;
        }
        if(c > nums.length/2) return ele;

        return -1;
    }
    
}
