public class SumOfOddNumbers {

    public static int sumOfOdd(int[] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 != 0) {
                sum = sum + arr[i];
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        int[] arr = {10, 15, 20, 25, 30, 35, 40};

        int result = sumOfOdd(arr);

        System.out.println("Sum of Odd Numbers = " + result);
    }
}