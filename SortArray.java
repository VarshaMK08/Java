
//// Ascending
// import java.util.Arrays;


// public class SortArray {
//     public static void main(String[] args) {
//         int[] arr = {50, 10, 40, 20, 30};

//         Arrays.sort(arr); // sort in ascending order

//         System.out.println("Sorted Array (Ascending): " + Arrays.toString(arr));
//     }
// }

////descending
// import java.util.Arrays;
// import java.util.Collections;

// public class SortArray {
//     public static void main(String[] args) {
//         Integer[] arr = {50, 10, 40, 20, 30};

//         Arrays.sort(arr, Collections.reverseOrder());

//         System.out.println("Sorted Array (Descending): " + Arrays.toString(arr));
//     }
// }

////Sort manually using a loop (Bubble Sort example)
public class SortArray {
    public static void main(String[] args) {
        int[] arr = {50, 10, 40, 20, 30};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {  // swap for ascending
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.print("Sorted Array (Ascending): ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

