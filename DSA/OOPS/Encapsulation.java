public class Encapsulation {
    // Encapsulation is the concept of wrapping data (variables) and code (methods) together as a single unit.
    // In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class.
    // This is known as data hiding.
    //example:
    private String name;
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        obj.setName("John");
        System.out.println("Name: " + obj.getName());

    }
}
