import java.util.HashMap;
public  class twosum{
    public static int[] twosum(int[] nums,int target){
        HashMap<Integer,Integer>map=new HashMap<>();
        for (int i = 0; i <nums.length; i++) {
            int need =target-nums[i];
            if(map.containsKey(need)){
                return new int[]{map.get(need),i};
            }   
            map.put(nums[i],i );  
        }

        return new int[]{-1,-1};

}
 public static void main(String[] args) {
     int[] nums={2,3,4,5,6,7};
     int[] ans=twosum(nums,5);
     System.out.println(ans[0]+""+ans[1]);
 }
}
