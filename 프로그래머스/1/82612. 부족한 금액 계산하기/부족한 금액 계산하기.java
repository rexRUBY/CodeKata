class Solution {
    public long solution(int price, int money, int count) {
        long totalCost = (long) count * (2 * price + (count - 1) * price) / 2;
        long diff = totalCost - money;
        
        return Math.max(diff, 0);
    }
}