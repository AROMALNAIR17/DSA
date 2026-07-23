public class CountNegativeNumbers {

    public static int countNegative(int[] arr) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] arr = {10, -5, 20, -15, 30, -40, 50};

        int result = countNegative(arr);

        System.out.println("Number of Negative Elements = " + result);
    }
}