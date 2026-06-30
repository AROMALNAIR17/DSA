public class MaximumSubarray {
    public static int maxarray(int[]nums){
        int current=nums[0];
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            current=Math.max(nums[i],current+nums[i]);
            max=Math.max(current,max);
           /* if(nums[i]>current+nums[i]){
                current=nums[i];
            }
            else{
                current=current+nums[i];

            }
            if(current>max){
                max= current;
            }
        */}
        return  max;
    }
    public static void main(String[] args) {
        int[] nums ={-1,-2,4,-5,6,7};
        System.out.println(maxarray(nums));
    }

}