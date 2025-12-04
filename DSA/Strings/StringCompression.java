public class StringCompression {
    public static String compress(String str){
        String compressed="";
        for(int i=0; i<str.length(); i++){
            Integer count=1;
            // Count consecutive characters
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            compressed+=str.charAt(i);
            compressed+=count;
        }
        return compressed;
    }
    public static void main(String[] args) {
        String str="aaabbc";
        System.out.println(compress(str));
    }
}
