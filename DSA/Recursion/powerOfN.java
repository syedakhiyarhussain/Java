public class powerOfN {
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        return x*power(x,n-1); 
    }
    public static int optimizedPower(int x, int n){
        if(n==0){
            return 1;
        }
        int halfPower=optimizedPower(x, n/2)*optimizedPower(x, n/2);
        //for odd n
         if(n%2!=0){
            halfPower=x*halfPower;
        }
        return halfPower;

    }
    public static void main(String[] args) {
        System.out.println(power(2,5));
        System.out.println(optimizedPower(2,5));
    }

}