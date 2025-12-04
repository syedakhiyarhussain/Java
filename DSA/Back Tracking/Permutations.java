public class Permutations {
    public static void perm(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char currChar=str.charAt(i);//choosing the character
            String newStr=str.substring(0,i)+str.substring(i+1);//rest of the string
            perm(newStr, ans+currChar);
            
        }
    }
    public static void main(String[] args) {
        String str="abc";
        perm(str, "");
    }
}
