public class SumOfArray {

    public static int sumArray(int[] nums) {

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {

            sum = sum + nums[i];

        }

        return sum;
    }

    public static void main(String[] args) {

        int[] nums = {2, 4, 6, 8};

        int answer = sumArray(nums);

        System.out.println("Sum = " + answer);

    }
}