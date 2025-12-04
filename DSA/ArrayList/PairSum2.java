import java.util.*;
public class PairSum2 {
    //finding sum in an sorted and rotated array
    public static boolean pairsum(ArrayList<Integer> list, int target){
        int BreakingPoint=-1;
        int n=list.size();
        for(int i=0; i<n-1; i++){
            if(list.get(i)>list.get(i+1)){
                BreakingPoint=i;
                break;
            }
        }
        int lp=BreakingPoint+1, rp=BreakingPoint;
        while(lp!=rp){
            int sum=list.get(lp)+list.get(rp);
            if(sum<target){
                lp=(lp+1)%n;
            }else if(sum>target){
                rp=(n+rp-1)%n;
            }else{
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(pairsum(list, 16));
    }
}
