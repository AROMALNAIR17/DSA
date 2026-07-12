import java.util.*;

public class FindDuplicatesOptimal {

    public static List<Integer> findDuplicates(int[] nums) {

        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            int index = Math.abs(nums[i]) - 1;

            if (nums[index] < 0) {

                answer.add(Math.abs(nums[i]));

            } else {

                nums[index] = -nums[index];

            }

        }

        return answer;
    }

    public static void main(String[] args) {

        int[] nums = {4,3,2,7,8,2,3,1};

        List<Integer> result = findDuplicates(nums);

        System.out.println(result);

    }
}