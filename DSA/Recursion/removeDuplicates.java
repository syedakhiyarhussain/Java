public class removeDuplicates {
    public static void remDup(String str, int i, StringBuilder newString, boolean[] map){
        if(i==str.length()){
            System.out.print(newString);
            return;
        }
        int currChar=str.charAt(i)-'a';
        if(map[currChar]==true){
            //duplicate
            remDup(str, i+1, newString, map);
        }else{
            map[currChar]=true;
            remDup(str, i+1, newString.append(str.charAt(i)), map);
        }

    }
    public static void main(String[] args) {
        String str="appnnacollege";
        boolean[] map=new boolean[26];
        remDup(str, 0, new StringBuilder(""), map);
    }
    
}
