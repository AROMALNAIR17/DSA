public class smallevennum{

    public static int findSmallestEven(int[] arr) {

        int smallestEven = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0 && arr[i] < smallestEven) {
                smallestEven = arr[i];
            }
        }

        if (smallestEven == Integer.MAX_VALUE) {
            return -1; // No even number found
        }

        return smallestEven;
    }

    public static void main(String[] args) {

        int[] arr = {15, 8, 23, 2, 18, 11};

        int result = findSmallestEven(arr);

        if (result == -1) {
            System.out.println("No Even Number Found");
        } else {
            System.out.println("Smallest Even Number = " + result);
        }
    }
}