public class numberOfSteps {
    public static int main(String[] args) {
        return numZero(9,0);
    }
    static int numZero(int num, int cnt){
        if(num == 0) return cnt;

        if(num%2 == 0){
            return numZero(num/2, cnt+1);
        }
        return numZero(num-1, cnt+1);
    }
}
