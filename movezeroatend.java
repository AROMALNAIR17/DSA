public  class movezeroatend{
    public static void movezero(int []arr){
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j++;
        } 
        }

    }
    public static void main(String[] args) {
        int[] arr={0,0,1,2,3};
        movezero(arr);
        for(int num:arr){
        System.out.println(num);}
    }
}