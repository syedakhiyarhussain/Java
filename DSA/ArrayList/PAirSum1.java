import java.util.*;
public class PairSum1 {
    //Brute force:- find all possible pairs
    //we are going to use 2 pointer approach
    public static boolean pairsum(ArrayList<Integer> list,int target){
        int i=0, j=list.size()-1;
        if(list.size()<2){
            return false;
        }
        Collections.sort(list);
        while(i<j){
            int sum=list.get(i)+list.get(j);
            if(sum<target){
                i++;
            }else if(sum>target){
                j--;
            }else{
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(pairsum(list, 5));
    }
}
