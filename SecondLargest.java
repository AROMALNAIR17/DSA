public class SecondLargest{
    public static int findSecondLargest(int []arr){
        if(arr.length<2){
            return -1;
        }
        int largest=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int num:arr){
            if(num>largest){
                second  = largest;
                largest=num;
            }
            else if(num>second && num!=largest){
                            second =num;


            }

        }
        if(second==Integer.MIN_VALUE){
            return -1;

        }
        return second ;

    }
    public static void main(String []args){
        int[] arr={2,3,4,5,16,7,8};
        System.out.println(findSecondLargest(arr));
    }
}//// GitHub contribution test