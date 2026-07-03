public class MajorityElement{
    public static int majorityelement(int[]nums){
        int count =0;
        int candiate=0;
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
        int[] nums={2,3,4,5,7,7,7};
        System.out.println(majorityelement(nums));
        
    }
   
}