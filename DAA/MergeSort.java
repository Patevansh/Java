package DAA;

public class MergeSort {
    public static void main(String[] args) {
        Solution s=new Solution();
        int[] arr = {1,4,30,20,2,6,10,5};
        int[] a = s.mergeSort(arr, 0, arr.length-1);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
class Solution {
    public int[] mergeSort(int[] arr, int lo, int hi) {
        if (lo == hi) {
            int[] A = { arr[lo] };
            return A;
        }
        int mid = (lo + hi) / 2; //lo + (hi-lo)/2;
        int[] arr1 = mergeSort(arr, lo, mid);
        int[] arr2 = mergeSort(arr, mid + 1, hi);
        int[] arr3 = merge(arr1, arr2);
        return arr3;
    }

    static int[] merge(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int[] arr3 = new int[m + n];
        int idx = 0;
        int i = 0;
        int j = 0;
        while (i < m && j < n) {
            if (arr1[i]<arr2[j]) {
                arr3[idx] = arr1[i];
                i++;
                idx++;
            } else {
                arr3[idx] = arr2[j];
                j++;
                idx++;
            }
        }
        while (i < m) {
            arr3[idx] = arr1[i];
            i++;
            idx++;
        }
        while (j < n) {
            arr3[idx] = arr2[j];
            j++;
            idx++;
        }
        return arr3;
    }
}
