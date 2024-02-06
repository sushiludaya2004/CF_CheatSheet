//https://www.geeksforgeeks.org/problems/factorial5739/1
class Solution{
    static long factorial(int N){
      
      if(N == 0 || N == 1) return 1;
      else{
          return N * factorial(N - 1);
      }
        
    }
}
