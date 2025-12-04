public class classAndobject {
    public static void main(String[] args) {
        //create object
        Pen p1=new Pen();
        //use object
        p1.setColor("Blue");
        
        p1.tip=5;
        System.out.println("Pen color is: "+p1.color);
        System.out.println("Pen tip size is: "+p1.tip);
    }
}
//class definition
class Pen{
    String color;
    int tip;
    void setColor(String newColor){
        color=newColor;
    }
}
