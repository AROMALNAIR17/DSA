public class binarysearch{
    public static int search(int[]nums,int target ) {
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid]==target){
                return mid;

            }
            else if(nums[mid]<target){
                left=mid+1;

            }
            else{
                right=mid-1;
            }

        }
            return -1;

        
    }
    public static void main(String[] args) {
        int[] nums ={2,4,5,6,7,8,9};
        System.out.println(search(nums,9));
        /*int target =9;
        int result=search(nums,target);
        System.out.println(result);*/
    }
}