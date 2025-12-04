public class friendsPairing {
    public int ways(int n){
        if(n==1||n==2){
            return n;
        }
        //friend 1 can remain single
        int fnm1=ways(n-1);
        //friend 1 can pair up with any of the remaining n-1 friends
        int fnm2=ways(n-2);
        int pairings=(n-1)*fnm2;
    }
}
