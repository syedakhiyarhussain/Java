public class Multiple_Inheretence {
    //multiple inheretence can't be achieved using classes in java
    //but can be achieved using interfaces
    public static void main(String[] args) {
        HybridCar hc1=new HybridCar();
        hc1.fuel();
        hc1.charge();
    }
}
interface PetrolCar{
    void fuel();
}
interface ElectricCar{
    void charge();
}
class HybridCar implements PetrolCar,ElectricCar{
    public void fuel(){
        System.out.println("Hybrid car runs on petrol");
    }
    public void charge(){
        System.out.println("Hybrid car can be charged electrically");
    }
}
