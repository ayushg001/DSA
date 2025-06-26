public class bus_and_sell_stock_problem {
    
    public static void  stocks(int nums[]){

        int buy_price = Integer.MAX_VALUE;
        int sell_price = 0;
        int max_profit = 0;
        for( int i =0; i < nums.length ; i++ ){
            sell_price=nums[i];
            if (buy_price < sell_price) {
                int profit = sell_price - buy_price;         // todays profi
                max_profit = Math.max(max_profit, profit);
            } else {
                buy_price = sell_price;
            }
        }
        System.err.println("max profit is " +max_profit);
    }


    public static void main(String[] args) {
        int nums[] = {7,1,5,3,6,4};
        stocks(nums);
    }
}
