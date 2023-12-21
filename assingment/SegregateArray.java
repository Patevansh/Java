package assingment;
public class SegregateArray {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 1, 0, 2, 1, 2, 0};
        segregate(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void segregate(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        int temp;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0: {
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1: {
                    mid++;
                    break;
                }
                case 2: {
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
                }
            }
        }
    }
}
