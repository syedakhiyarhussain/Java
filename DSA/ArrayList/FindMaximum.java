import java.util.*;
public class FindMaximum {
    public static int maxValue(ArrayList<Integer> list){
        int max=Integer.MIN_VALUE;
        for(int i: list){
            if(i>max){
                max=i;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(7);
        System.out.println(maxValue(list));
    }
}
