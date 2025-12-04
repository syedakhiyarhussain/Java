public class Abstract_Class {
    // An abstract class is a class that cannot be instantiated on its own and is meant to be subclassed.
    //it can have both abstract and non-abstract methods.
    // It can contain abstract methods (methods without a body) that must be implemented by subclasses.
    /* Example:
     * abstract class Animal {
     *     abstract void sound(); // Abstract method
     * }
     * class Dog extends Animal {
     *     void sound() {   // Implementing the abstract method
     *        System.out.println("Dog barks");}
     */
    public static void main(String[] args) {
        Horse h1=new Horse();// Constructor of Animal called first then Horse(parent class constructor called first)
        h1.walk();
        Chicken c1=new Chicken();
        c1.walk();
    }

}
abstract class Animal{
    Animal(){
        System.out.println("Animal Constructor Called");
    }
    void eats(){
        System.out.println("Eats");
    }
    abstract void walk();
}
class Horse extends Animal{
    Horse(){
        System.out.println("Horse Constructor Called");
    }
    void walk(){
        System.out.println("Walks on 4 legs");
    }
}
class Chicken extends Animal{
    void walk(){
        System.out.println("Walks on 2 legs");
    }
}

