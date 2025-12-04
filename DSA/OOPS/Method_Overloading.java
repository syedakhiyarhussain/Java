public class Method_Overloading {
    // Method overloading is a feature that allows a class to have more than one method with the same name, but different parameters (different type, number, or both).
    /* Example:
     * void add(int a, int b)
     * void add(double a, double b)
     * int add(int a, int b, int c)
     */
    public static void main(String[] args) {
        Calculator c1=new Calculator();
        c1.add(1,2);
        c1.add(1.5,2.5);
        System.out.println(c1.add(1,2,3));
        
    }
}
class Calculator{
    // Method to add two integers
    void add(int a, int b){
        System.out.println("Sum of two integers: " + (a + b));
    }
    // Method to add two double values
    void add(double a, double b){
        System.out.println("Sum of two doubles: " + (a + b));
    }
    // Method to add three integers
    int add(int a, int b, int c){
        return a + b + c;
    }
}
