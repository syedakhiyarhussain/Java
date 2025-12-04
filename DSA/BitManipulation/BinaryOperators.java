public class BinaryOperators {
    //AND
    public static int and(int a, int b){
        return a & b;
    }
    //OR
    public static int or(int a, int b){
        return a | b;
    }
    //XOR
    public static int xor(int a, int b){   
        return a ^ b;
    }
    //One's Complement
    public static int onesComplement(int a){
        return ~a;
    }
    //Left Shift
    public static int leftShift(int a, int n){  
        return a << n;
    }
    //Right Shift
    public static int rightShift(int a, int n){
        return a >> n;
    }
    public static void main(String[] args) {
        int a = 5; //0101
        int b = 3; //0011
        System.out.println("AND: " + and(a, b)); //0001 -> 1
        System.out.println("OR: " + or(a, b));   //0111 -> 7
        System.out.println("XOR: " + xor(a, b)); //0110 -> 6
        System.out.println("One's Complement of a: " + onesComplement(a)); //1010 -> -6 
        System.out.println("Left Shift a by 1: " + leftShift(a, 2)); //010100 -> 20 (a<<b=a*2^b)
        System.out.println("Right Shift a by 1: " + rightShift(6, 2)); //0001 -> 1 (a>>b=a/2^b)
    }
}
