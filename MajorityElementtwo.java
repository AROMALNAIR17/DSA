public class MajorityElementtwo{
    public static int major(int[]nums) {
        int candiate=0;
        int count=0;
        for(int num:nums){
            if(count==0){
               candiate=num;
            }
            if(num==candiate){
                count++;

            }
            else{
                count--;
            }
        }
            return candiate;
    }
    public static void main(String[] args) {
        int[]nums={2,2,2,3,2};
        int answer=major(nums);
        System.out.println(answer);
    }

}