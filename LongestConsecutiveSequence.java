import java.util.HashSet;
public class LongestConsecutiveSequence{
public static int longest(int[] nums){
    HashSet<Integer>set=new HashSet<>();
    for(int num:nums){
        set.add(num);

    }
    int longest=0;
    for(int num:set){
        int current =num;
        int length=1;
        while(set.contains(current+1)){
            current++;
            length++;

        }
        longest=Math.max(longest,length);

    }
    return longest;


}
public static void main(String[] args) {
    int[] nums={2,3,4,7};
    int answer=longest(nums);
    System.out.println(answer);
}
}