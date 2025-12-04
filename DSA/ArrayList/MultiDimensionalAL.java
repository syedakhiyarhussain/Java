import java.util.*;
public class MultiDimensionalAL {
    public static void main(String[] args) {
        //syntax                                                                               
        //ArrayList<ArrayLIst<Integer>> MainList=new AL<>(); 
        //ArrayList<Integer> l1=new AL<>();
        ArrayList<ArrayList<Integer>> MainList=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        MainList.add(list1);
        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);
        MainList.add(list2);
        System.out.println(MainList);

        //or

        for(int i=0; i<MainList.size(); i++){
            ArrayList<Integer> currentList=new ArrayList<>();
            for(int j=0; j<currentList.size(); i++){
                System.out.print(currentList.get(i));
            }
            System.out.println();
        }
    }
}
