public class RemoveElement{
    public static int remove(int[]nums,int val){
        int k=0;
        for(int i=0 ;i<nums.length;i++){
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }


        }
        return k;
    }
    public static void main(String[] args) {
        int[] nums={2,3,3,2};
        int answer= remove(nums,3);
        System.out.println(answer);
    }
}