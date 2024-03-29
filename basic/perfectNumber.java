//https://www.geeksforgeeks.org/problems/perfect-numbers3207/1
class Solution {
    static int isPerfectNumber(long N) {
         if (N <= 1) {
            return 0; 
        }

        long sum = 1; 
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                sum += i;
                if (i != N / i) {
                    sum += N / i;
                }
            }
        }

        return (sum == N) ? 1 : 0;
    }
};
