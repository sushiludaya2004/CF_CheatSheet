//https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/submissions/1174285974/
class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        if(nums.length > threshold) return -1;
        //Find the maximum element:
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            maxi = Math.max(maxi, nums[i]);
        }
        int low = 0, high = maxi;
        while( low <= high){
            int mid = ( low + high ) / 2;
            if( sumD(nums, mid) <= threshold) high = mid - 1;
            else low = mid + 1;
        }
        return low;
    }

    int sumD(int[] arr, int n){
        int sum = 0;
        for( int i = 0; i < arr.length; i++){
            sum += Math.ceil((double)(arr[i]) / (double)(n));
        }
        return sum;
    }
}
