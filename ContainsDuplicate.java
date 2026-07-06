
import java.util.HashSet;

public class ContainsDuplicate {
    public static boolean dupli(int[]nums){
        HashSet<Integer>set=new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int num=nums[i];
            if(set.contains(num)){
                return true;

            }
                set.add(num);
            
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,3};
        System.out.println(dupli(nums));
    }

    }