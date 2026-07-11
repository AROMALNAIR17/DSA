import java.util.*;
public class  FindDuplicates {
    public static List<Integer>findDuplicates(int[]nums){
        HashSet<Integer>seen=new HashSet<>();
        List<Integer> answer=new ArrayList<>();
        for(int num:nums){
            if(seen.contains(num)){
                answer.add(num);

            }
             else{
            seen.add(num);
        }

        }
        return answer;
       
        }
        public static void main(String[] args) {
            int[] nums={2,2,3,4,5,5,6};
            List<Integer>result=findDuplicates(nums);
            System.out.println(result);         
        }
    }
