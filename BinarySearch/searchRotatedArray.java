//https://leetcode.com/problems/search-in-rotated-sorted-array-ii/submissions/1169787869/
//with duplicates
class Solution {
    public boolean search(int[] nums, int target) {
        return bs(nums, target);
    }

    static boolean bs(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = ( low + high ) / 2;
            if(arr[mid] == target) return true;
            if(arr[low] == arr[mid] && arr[mid] == arr[high]){
                low++;
                high--;
                continue;
            }
            if (arr[low] <= arr[mid]){
                if(arr[low] <= target && target <= arr[mid] ){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
            else{
                if(arr[mid] <= target && target <= arr[high] ){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
        }
        return false;
    }
}

