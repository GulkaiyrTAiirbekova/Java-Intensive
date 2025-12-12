package Leetcode;

public class Solution {
    public int maxProfit(int[] price){
        int n = price.length;
        boolean hold = false;
        int ans = 0;
        for (int i =0; i< n; i++){
            //buying stock
            if(hold == false && i+ 1 <n && price[i+1]){
                hold = true;
                ans -= price[i];
            }
            //selling stock
            if(hold == true && (i +1 ==n || price [i+1])){
                hold = false;
                ans += price[i];
            }
        }
        return ans;
    }
}
