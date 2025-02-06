package Quiz2;

import java.util.Arrays;

public class balikArray {
    public static void balikArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Sebelum dibalik: " + Arrays.toString(arr));
        balikArray(arr);
        System.out.println("Setelah dibalik: " + Arrays.toString(arr));
    }
}