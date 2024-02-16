//https://www.geeksforgeeks.org/problems/insertion-sort/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article

class Solution
{
  public void insertionSort(int arr[], int n)
  {
      int d = 0;
      for(int i=0;i<=n-1;i++)
      {
        
        int j = i;
        while(j>0 && arr[j-1] > arr[j]){
            swap(j-1, j, arr);
            j--;
            
        }
        
      }
  }
  
  static void swap(int i , int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
