public class OddOrEven {
    //using bit manipulation
    public static boolean isEven(int n){
        int bitMask=1; //0001
        return (n & bitMask) == 0; //if last bit is 0 then even else odd
    }
    public static void main(String[] args) {
        int number = 4;
        if(isEven(number)){
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }
    }
}
