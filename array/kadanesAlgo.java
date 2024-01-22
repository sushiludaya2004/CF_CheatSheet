//https://www.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1
class Solution{

    long maxSubarraySum(int arr[], int n){
        
         long sum = 0, max = Long.MIN_VALUE;
        
        for (int i = 0; i < n; ++i) {
            sum += arr[i];
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        
        return max;
        
    }


    
}
