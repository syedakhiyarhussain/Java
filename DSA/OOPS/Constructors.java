public class Constructors {
    public static void main(String[] args) {
        //default constructor
        Student s1=new Student();
        
        //parameterized constructor
        Student s2=new Student("Alice",101);
        System.out.println("Name: "+s2.name);
        System.out.println("Roll: "+s2.roll);
        
        //copy constructor
        Student s3=new Student(s2);
        System.out.println("Name: "+s3.name);
        System.out.println("Roll: "+s3.roll);
    }
}

class Student{
    String name;
    int roll;
    //constructor
    Student(){
        System.out.println("Constructor called");
    }
    //parameterized constructor
    Student(String name, int roll){
        this.name=name;
        this.roll=roll;
    }
    //copy constructor
    Student(Student s){
        this.name=s.name;
        this.roll=s.roll;
    }
}