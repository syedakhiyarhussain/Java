public class clear_ith_Bit {
    public static int clearithBit(int n, int i){
        int BitMAsk=~(1<<i);
        return n & BitMAsk;
    }
    public static void main(String[] args) {
        int n=5; //0101
        int i=2;
        System.out.println(clearithBit(n, i));
    }
}
