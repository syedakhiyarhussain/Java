public class BuyAndSellStocks{
    public static int MaxProfit(int arr[]){
        int profit=0, buyingPrice=arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]<buyingPrice){
                buyingPrice=arr[i];
            }else{
                profit=Math.max(profit, arr[i]-buyingPrice);
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        System.out.println(MaxProfit(arr));
    }
}