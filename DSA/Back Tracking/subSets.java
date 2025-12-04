public class subSets {
    public static void subsets(String str, String ans, int i){
        //base case
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("Null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }
        //kaam
        subsets(str,ans+str.charAt(i), i+1);//include---function call
        subsets(str, ans, i+1); //exclude---backtracking step
    }
    public static void main(String[] args) {
        String str="abc";
        subsets(str, "", 0);
    }   
}
