public class Super_Keyword {
    // The super keyword in Java is a reference variable that is used to refer to the immediate parent class object.
    // It can be used to access parent class methods, variables, and constructors.
    public static void main(String[] args) {
        Horse h1=new Horse();// Constructor of Animal called first then Horse(parent class constructor called first)
    }    
}
class Animal{
    String colour;
    Animal(){
        System.out.println("Animal Constructor Called");
    }
}
class Horse extends Animal{
    Horse(){
        super();//calls parent class constructor [in java, super() is by default called if we don't write it explicitly)]
        System.out.println("Horse Constructor Called");
        super.colour="Brown";//accessing parent class variable
        System.out.println("Horse color: "+super.colour);
    }
}
