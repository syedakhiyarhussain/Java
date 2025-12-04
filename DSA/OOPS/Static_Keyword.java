public class Static_Keyword {
    // The static keyword in Java is used for memory management primarily for methods and variables.
    // It can be applied to variables, methods, blocks, and nested classes.
    // When a member is declared static, it belongs to the class rather than to any specific instance of the class.
    //properties, functions, blocks and nested classes can be declared static.
    // if we change the value of a static variable, it changes for all instances of the class.
    
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Alice";
        s1.roll=1;
        Student.SchoolName="ABC High School";
        Student s2=new Student();
        s2.name="Bob";
        s2.roll=2;
        System.out.println(s1.name + " " + s1.roll + " " + Student.SchoolName);
        System.out.println(s2.name + " " + s2.roll + " " + Student.SchoolName);//static variable is shared among all instances of the class

        //our main function is static because there can be only one main function and it should be accessible without creating an instance of the class.
    }
}
class Student{
    String name;
    int roll;
    static String SchoolName;
    static int returnPercentage(int maths, int science, int english){
        return (maths + science + english) / 3;
    }

}

