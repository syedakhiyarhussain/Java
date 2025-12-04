public class Palindrome {
    static boolean PalindromeOrNot(int n){
        int sum=0, temp=n;
        while(temp>0){
            int rem=temp%10;
            sum=(sum*10)+rem;
            temp/=10;
        }
        if(sum==n){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int n=121;
        System.out.println(PalindromeOrNot(n));
    }
}
