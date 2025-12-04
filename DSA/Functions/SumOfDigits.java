public class SumOfDigits {
    static int sumof(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n=1234;
        System.out.println(sumof(n));
    }
}
