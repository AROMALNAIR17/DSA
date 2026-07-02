public class runningsum{
    public static int[]runsum(int[]nums){
        int[] prefix=new int[nums.length];
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]+nums[i];


        }
        return prefix;


    }
    public static void main(String[] args) {
        int[]nums={2,3,4,5,6,7,8,9};
        int[] ans =runsum(nums);
        for(int num:ans){
            System.out.println(num);
        }


    }
}