//https://www.geeksforgeeks.org/problems/selection-sort/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
class Solution
{
    void selectionSort(int arr[], int n)
    {
       for(int i=0;i<n-1;i++)
       {
           int min = i;
           for(int j = i+1; j < n; j++){
               if(arr[j] < arr[min]) min = j;
           }
           swap(i, min, arr);
       }
    }
    
    static void swap(int i , int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
