public class leader {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        findLeaders(arr);
    }

    public static void findLeaders(int[] arr) {
        int n = arr.length;
        int max_from_right = arr[n - 1];

        System.out.print("Leaders in the array: " + max_from_right + " ");

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > max_from_right) {
                max_from_right = arr[i];
                System.out.print(max_from_right + " ");
            }
        }
    }
}
