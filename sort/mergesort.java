
public class mergesort {

    public static void merge(int arr[], int s, int mid, int e) {
        int leftSize = mid - s + 1;
        int rightSize = e - mid;

        int left[] = new int[leftSize];
        int right[] = new int[rightSize];

        for (int i = 0; i < leftSize; i++)
            left[i] = arr[s + i];
        for (int j = 0; j < rightSize; j++)
            right[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = s;
        while (i < leftSize && j < rightSize) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < rightSize) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int arr[], int s, int e) {
        if (s < e) {
            int mid = s + (e - s) / 2;
            mergeSort(arr, s, mid);
            mergeSort(arr, mid + 1, e);
            merge(arr, s, mid, e);
        }
    }

    public static void main(String args[]) {
        int arr[] = {2, 1, 6, 4,5, 3};
        int s = 0;
        int e = arr.length - 1;
        mergeSort(arr, s, e);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
