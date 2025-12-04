public class Heirarchial_Inheritance {
    // Heirarchial inheritance is a type of inheritance where multiple classes are derived from a single base class.
    /* Example:
     *          Class A (Base Class)
     *         /        \
     *   Class B      Class C
     * (Derived from A)(Derived from A)
     */
    public static void main(String[] args) {
        Fish f1=new Fish();
        f1.eats();
        f1.swims();
        Bird b1=new Bird();
        b1.eats();
        b1.flies();
    }
}
class Animals{
    void eats(){
        System.out.println("Eats");
    }
}
class Fish extends Animals{
    void swims(){
        System.out.println("Swims");
    }
}
class Bird extends Animals{
    void flies(){
        System.out.println("Flies");
    }
}
