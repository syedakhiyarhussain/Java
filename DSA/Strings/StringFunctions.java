public class StringFunctions {
    public static void main(String[] args) {
        String str="Akhiyar";
        String str2="Hi";
        System.out.println("String: " + str);
        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Character at index 2: " + str.charAt(2));
        System.out.println("Substring from index 1 to 4: " + str.substring(1, 4));
        System.out.println(str.substring(2));
        System.out.println(str.compareTo(str2));
        System.out.println("ApnaCollege".replace("l", ""));
        String str3 = "a1b2c3";
        String result = str3.replaceAll("[0-9]", "X");
        System.out.println(result);
        String s1 = new String("hello");
        String s2 = "hello";

        System.out.println(s1 == s2);               // false (different memory)
        System.out.println(s1.intern() == s2);      // true (same reference from pool)
    }
}
