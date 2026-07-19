public class SmallestElement {

    public static int findSmallest(int[] arr) {

        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        return smallest;
    }

    public static void main(String[] args) {

        int[] arr = {25, 10, 45, 5, 30};

        int result = findSmallest(arr);

        System.out.println("Smallest Element = " + result);
    }
}