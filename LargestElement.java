class LargestElement {

    public static void main(String[] args) {

        int[] arr = {2,4,5,6,7};

        int max = arr[0];

        for(int i = 1; i < arr.length; i++) {

            if(arr[i] > max) {
                max = arr[i];
            }

        }   // <-- for loop ends here

        System.out.println(max);   // <-- OUTSIDE the loop

    }
}