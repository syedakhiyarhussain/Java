public class tailing {
    public static int tail(int n){
    // a 2*1 board can be filled in only one way
    if (n == 0 || n == 1) return 1;
    int fnm1=tail(n-1);
    int fnm2=tail(n-2);
    int fn=fnm1+fnm2;
    return fn;
    }
    public static void main(String[] args) {
        System.out.println(tail(5));
    }
}
