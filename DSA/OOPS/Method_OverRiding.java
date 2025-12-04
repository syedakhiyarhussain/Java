public class Method_OverRiding {
    // Method overriding is a feature that allows a subclass to provide a specific implementation of a method that is already defined in its superclass.
    /* Example:
     * class Animal {
     *     void sound() {
     *         System.out.println("Animal makes a sound");
     *     }
     * }
     * class Dog extends Animal {
     *     @Override
     *     void sound() {
     *         System.out.println("Dog barks");
     *     }
     * }
     */
    public static void main(String[] args) {
        Deer d1=new Deer();
        d1.eats();//-> Calls the eats method of Deer class
    }
}
class Animal{
    void eats(){
        System.out.println("Eats");
    }
}
class Deer extends Animal{
    void eats(){
        System.out.println("Eats Grass");
    }
}
