public class Clear_Last_i_bits {
    public static int clearIBits(int n, int i){
        // ~0 = 11111111111111111111111111111111
        // ~0<<2 = 11111111111111111111111111111100
        int BitMask=(~0)<<i;
        return n & BitMask;
    }
    public static void main(String[] args) {
        int n=15;
        int i=2;
        System.out.println(clearIBits(n, i));
    }
}
