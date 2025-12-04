public class clear_Range_of_bits {
    public static int clearRangeOfBits(int n, int i, int j){
        //where i=starting index and j=ending index
        int a= (~0)<<(j+1); //11111111111111111111111111000000 where j=3
        int b=(1<<i)-1;    //00000000000000000000000000000001 where i=1 ((1<<i)-1=2^i-1)
        int BitMask=a|b;   //11111111111111111111111111000111
        return n & BitMask; //clearing bits from i to j
}
    public static void main(String[] args) {
        int n=31; //11111
        int i=1;
        int j=3;
        System.out.println(clearRangeOfBits(n, i, j));
    }
}
