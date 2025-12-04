public class SettersAndGetters {
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.setColor("Red");
        p1.setTip(7);
        System.out.println("Pen color is: "+p1.getColor());
        System.out.println("Pen tip size is: "+p1.getTip());
    }
    
}
class Pen{
    private String color;
    private int tip;
    public void setColor(String colour){
        //this keyword is used to refer to the current object's instance variable
        this.color=colour;
    }
    public String getColor(){
        return this.color;
    }
    public void setTip(int tipSize){
        this.tip=tipSize;
    }
    public int getTip(){
        return this.tip;
    }
}
