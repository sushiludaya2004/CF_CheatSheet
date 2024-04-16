import java.util.Arrays;

public class mSInPlace {
    public static void main(String[] args) {
        int[] a = {9,8,7,6,3,1};
        mergeSort(a, 0, a.length);
        System.out.println(Arrays.toString(a));

    }

    static void mergeSort(int[] arr, int s, int e){
        if(e-s == 1) return;

        int mid = (s+e) / 2;

        mergeSort(arr,s,mid);
        mergeSort(arr,mid, arr.length);

        merge(arr, s, mid, e);
    }


    private static void merge(int[] arr, int s, int m, int e){
        int[] sortedArray = new int[e-s];

        int i = s, j=m, k=0;

        while(i< m && j< e){
            if(arr[i] < arr[j]){
                sortedArray[k] = arr[i];
                i++;
            }else{
                sortedArray[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i < m){
            sortedArray[k] = arr[i];
            i++;
            k++;
        }
        while(j < e){
            sortedArray[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < sortedArray.length; l++) {
            arr[s+l] = sortedArray[l];
        }
    }
}
