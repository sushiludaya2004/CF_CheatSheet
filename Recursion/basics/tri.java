public class tri {
    public static void main(String[] args) {
        trii3(4,0);
    }

    static void tri(int r){
        int c = 0;
        if(r == 0) return;
        while(c < r) {
            System.out.print("*");
            c++;
        }
        System.out.println();
        tri(r-1);
    }

    static void trii2(int r, int c){
        if(r == 0) return;
        if(c < r){
            System.out.print("*");
            trii2(r,c+1);
        }else{
            System.out.println();
            trii2(r-1, 0);
        }
    }


    static void trii3(int r, int c){
        if(r == 0) return;
        if(c < r){
            trii3(r,c+1);
            System.out.print("*");
        }else{
            trii3(r-1, 0);
            System.out.println();
        }
    }
}
