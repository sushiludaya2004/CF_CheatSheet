import java.util.ArrayList;
import java.util.List;

public class mergeSort {
    public static void main(String[] args) {
        int[] a = {3, 2, 1, 4};
        mS(a, 0, a.length - 1);
        for (int i = 0; i < a.length - 1; i++) {
            System.out.println(a[i]);
        }
    }

    static void mS(int[] arr, int low, int high) {
        if (low >= high) return;
        int mid = (low + high) / 2;
        mS(arr, low, mid);
        mS(arr, mid + 1, high);
        merge(arr, low, mid, high);

    }

    static void merge(int[] arr, int low, int mid, int high) {
        //[low...mid]
        int left = low;
        //[mid+1...high]
        int right = mid + 1;
        List<Integer> temp = new ArrayList<>();

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }
}
