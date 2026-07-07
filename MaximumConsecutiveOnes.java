public class MaximumConsecutiveOnes{
    public static int consecutiveone(int[]nums){
         int current=0;
         int max =0;
         for(int num:nums){
            if(num==1){
                current++;
                max=Math.max(current,max);

            }
            else{
                current=0;
            }
         }
         return max;
    }
    public static void main(String[] args) {
        int[]nums={1,1,0,1,1,1};
        System.out.println(consecutiveone(nums));
    }

}