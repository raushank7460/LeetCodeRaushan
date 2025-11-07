public class BestTimeToStockBuyAndSell {
    public static void main(String[] args) {
        int[]prices={7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }


    public static int maxProfit(int[]prices){
        int minPrice=Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int ele:prices){
            if(ele<minPrice){
                minPrice=ele;
            }
            else if(ele-minPrice>maxProfit){
                maxProfit=ele-minPrice;
            }

        }
        return maxProfit;
    }

        
        
        
    
    
}
