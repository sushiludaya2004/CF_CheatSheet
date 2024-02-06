//https://www.geeksforgeeks.org/problems/nth-fibonacci-number1335/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
class Solution {
    int nthFibonacci(int n){
        if (n == 0)
            return 0;
        if (n == 1 || n == 2)
            return 1;
        int a = 1;
        int b = 1;
        int mod = 1000000007;
        for (int i = 3; i <= n; ++i) {
            int tmp = a + b;
            a = b;
            b = tmp % mod;
        }
        return b;
    }
}
