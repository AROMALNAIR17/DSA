public class removeduplicate{
    public static int remove(int[] nums){
        if(nums.length==0){
            return 0;

        }
        int j=0;
        for (int i = 1; i <nums.length; i++) {
            if(nums[i]!=nums[j]){
                j++;
                nums[j]=nums[i];
            }


            
        }
        return j+1;
    
    }
public static void main(String[] args) {
    int[] nums={1,2,4,3,5,3};
     
    System.out.println(remove(nums));
}
}