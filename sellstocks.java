public  class sellstocks{
    public static int sell(int[] prices){
        int minprize=prices[0];
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minprize){
                minprize=prices[i];
            }
            else{
                int profit=prices[i]-minprize;
                if(profit>maxprofit){
                    maxprofit=profit;
                }
            }

        }return maxprofit;
    }
    public static void main(String[] args) {
        int [] prices={1,2,4,5,6,0,14};
        System.out.println(sell(prices));
    }
}