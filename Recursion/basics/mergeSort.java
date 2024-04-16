import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = {5,6,4,3,2,1,9};
        arr = mergerSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergerSort(int[] arr){
        if(arr.length == 1) return arr;

        int mid = arr.length / 2;

        int[] left = mergerSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergerSort(Arrays.copyOfRange(arr,mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right){
        int[] sortedArray = new int[left.length + right.length];

        int i = 0, j=0, k=0;

        while(i< left.length && j< right.length){
            if(left[i] < right[j]){
                sortedArray[k] = left[i];
                i++;
            }else{
                sortedArray[k] = right[j];
                j++;
            }
            k++;
        }

        while(i < left.length){
            sortedArray[k] = left[i];
            i++;
            k++;
        }
        while(j < right.length){
            sortedArray[k] = right[j];
            j++;
            k++;
        }

        return sortedArray;
    }
}
