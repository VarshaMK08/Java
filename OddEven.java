import java.util.Arrays;

public class OddEven {
    public static void main(String[] args) {
        int[] arr = {10, 21, 32, 43, 54, 65, 76};

        int evenCount = 0, oddCount = 0;

        // Count evens and odds
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        int[] evenArr = new int[evenCount];
        int[] oddArr = new int[oddCount];

        int eIndex = 0, oIndex = 0;

        // Fill arrays
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenArr[eIndex++] = arr[i];
            } else {
                oddArr[oIndex++] = arr[i];
            }
        }

        System.out.println("Even Array: " + Arrays.toString(evenArr));
        System.out.println("Odd Array: " + Arrays.toString(oddArr));
    }
}
