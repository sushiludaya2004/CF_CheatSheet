public class Count0Digit {
    public static void main(String[] args) {
        int n = 10006;
        System.out.println(zeros(n,cnt));
    }

    static int cnt = 0;

    static int zeros(int n, int cnt){
        if(n/10 == 0) return cnt;

        int digit = n%10;
        if(digit == 0){
            return zeros(n/10, cnt+1);
        }
        else {
            return zeros(n/10, cnt);
        }
    }


}
