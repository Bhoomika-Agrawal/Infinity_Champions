package Day4_greedy;

class Solution {
    public int buyChoco(int[] prices, int money) {
        int min=Integer.MAX_VALUE;
        int sec=Integer.MAX_VALUE;
        for(int i:prices){
            if(i<min){
                sec=min;
                min=Math.min(i,min);
            }
            else {
                if(i<sec ){
                    sec=i;
                }
            }
        }
        if(min + sec > money){
            return money;
        }
        return money - (min + sec);
    }
}
