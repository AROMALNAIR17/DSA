public class maximumwater{
    public static int maxarea(int []height){
        int left=0;
        int right=height.length-1;
        int maxarea=0;
        while(left<right){
            int width=height[left]-height[right];
            int minheight=Math.min(height[left],height[right]);
            int area=minheight*width;
            maxarea=Math.max(maxarea,area);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }

        }
        return maxarea;


    }
    public static void main(String[] args) {
        int [] arr={3,5,6,7,8,9,7,4};
        System.out.println(maxarea(arr));
    }
}