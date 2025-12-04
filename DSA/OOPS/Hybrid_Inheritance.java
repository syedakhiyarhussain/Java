public class Hybrid_Inheritance {
    // Hybrid inheritance is a combination of two or more types of inheritance.
    /* Example:
     *          Class A (Base Class)
     *         /        \
     *   Class B      Class C
     * (Derived from A)(Derived from A)
     *         \        /
     *        Class D (Derived from B and C)
     */
    public static void main(String[] args) {
        DogLabrador dl=new DogLabrador();
        dl.eats();
        dl.legs=4;
        dl.breed="Labrador";
        dl.color="Yellow";
        System.out.println("Breed: "+dl.breed);
        System.out.println("Color: "+dl.color);
        System.out.println("Legs: "+dl.legs);
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
class DogLabrador extends Dog{
    String color;
}

