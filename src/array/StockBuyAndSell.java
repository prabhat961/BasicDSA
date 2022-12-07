//Problem Statement: You are given an array of prices where prices[i] is the price of a given stock on an ith day.
//You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to
// sell that stock. Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
package array;

public class StockBuyAndSell {
    //Method 1:
    public static int maxProfit(int[] arr){
        int maxPro = 0;
        for (int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length;j++){
                if (arr[j] > arr[i]){
                    maxPro = Math.max((arr[j] - arr[i]),maxPro);
                }
            }
        }
        return maxPro;
    }
    //Method 2:
    static int maxProfitoptimal(int[] arr) {
        int maxPro = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            minPrice = Math.min(minPrice, arr[i]);
            maxPro = Math.max(maxPro, arr[i] - minPrice);
        }
        return maxPro;
    }

    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println("Maximum profit is:"+maxProfit(arr));
    }
}
