public class Palindrome {
    public static boolean palindromeOrNot(String str){
        int first=0, last=str.length()-1;
        while(first<last){
            if(str.charAt(first)!= str.charAt(last)){
                return false;
            }
            first++;
            last--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "madam";
        if(palindromeOrNot(str)){
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }
}
