public class Update_ith_Bit {
    public static int clearithBIt(int n, int i){
        int bitmask=~(1<<i);
        return n&bitmask;
    }
    public static int UpdateithBit(int n, int i, int newBit){
        //n-->number, i-->position, newBit-->0 or 1
        n=clearithBIt(n, i);
        int bitmask=newBit<<i;
        return n|bitmask;
    }
    public static void main(String[] args) {
        int n=10; //0101
        int i=2;
        int newBit=1;
        System.out.println(UpdateithBit(n, i, newBit)); //1110=14
    }
}
