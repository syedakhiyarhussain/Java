public class Inheritance {
    public static void main(String[] args) {
        Fish f1=new Fish();
        f1.colour="Golden";
        f1.fins=4;
        System.out.println("Fish color: "+f1.colour);
        f1.Breathes();
        f1.eats();
        f1.swims();
    }
    
}
class Animal{
    String colour;
    void eats(){
        System.out.println("eats");
    }
    void Breathes(){
        System.out.println("breathes");
    }
}
class Fish extends Animal{
    int fins;
    void swims(){
        System.out.println("swims in water");
    }
}
