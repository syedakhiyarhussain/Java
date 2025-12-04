public class Multi_Level_Inheritance {
    // Multi-level inheritance is a type of inheritance where a class is derived from a class which is also derived from another class.
    // It forms a chain of inheritance.
    /* Example:
     * Class A (Base Class)
     *    |
     * Class B (Derived from A)
     *    |
     * Class C (Derived from B)
     */
    public static void main(String[] args) {
        Dog dobby=new Dog();
        dobby.eats();
        dobby.legs=4;
        dobby.breed="Labrador";
        System.out.println(dobby.legs);
    }
}
class Animals{
    void eats(){
        System.out.println("Eats");
    }
}
class Mammals extends Animals{
    int legs;
}
class Dog extends Mammals{
    String breed;
}
