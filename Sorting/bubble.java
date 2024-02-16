//https://www.geeksforgeeks.org/problems/bubble-sort/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
class Solution
{
    //Function to sort the array using bubble sort algorithm.
	public static void bubbleSort(int arr[], int n)
    {
        for(int i = n - 1; i >= 0; i--){
            int sw = 0;
            for(int j = 0; j <= i - 1; j++){
                if(arr[j] > arr[j+1]){
                    sw++;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if( sw == 0) break;
        }
    }
    
    
}
