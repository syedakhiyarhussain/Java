public class Set_Ith_Bit {
    public static int SetIthBit(int n, int i){
        int BitMask=(1<<i);
        return n | BitMask;
    }
    public static void main(String[] args) {
        int n=5; //0101
        int i=1;
        System.out.println(SetIthBit(n, i));
    }
}
