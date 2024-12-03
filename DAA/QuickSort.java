package DAA;

public class QuickSort {
    public static void main(String[] args) {
        int arr[]={4,6,2,5,7,9,1};
        QuickSort q=new QuickSort();
        int[] a=q.QuickSortpr(arr, 0, arr.length-1);
        for(int i=0;i<a.length;i++){
            System.err.println(arr[i]);
        }

    }
    int[] QuickSortpr(int arr[],int low,int high){
        if(low>=high){
            return arr;
        }
        int pid=QSort(arr, low, high);
        QuickSort q=new QuickSort();
        arr=q.QuickSortpr(arr, low,pid-1);
        arr=q.QuickSortpr(arr, pid+1, high);
        return arr;
    }

    int QSort(int arr[], int low, int high) {
        int pi = arr[low];
        int i = low, j = high;
        while (i < j) {
            while (arr[i] < pi) {
                i++;
            }
            while (arr[j] > pi) {
                j--;
            }
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
        }
        return j;
    }
}
