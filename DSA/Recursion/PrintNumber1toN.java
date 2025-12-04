public class PrintNumber1toN {
    public static void ans(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        ans(n-1);
        System.out.println(n);
    }    
    public static void main(String[] args) {
        ans(5);
    }
}
