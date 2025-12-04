public class Interfaces {
    // Interface is a blueprint of a class.
    //Example:
    /* Car(wheels,speed engine)->Interface
    Maruti800->class implementing the interface Car
    BMW->class implementing the interface Car
    */

    //uses:
    // 1. Achieve abstraction
    // 2. Achieve multiple inheritance

    //properties:
    // 1. All methods are abstract by default (only method signature, no body)
    // 2. All variables are public, static and final by default

    public static void main(String[] args) {
        Queen q1=new Queen();
        q1.moves();
    }

}
interface Chessplayer{
    void moves();//abstract method, should be implemented by the class implementing this interface
}
class Queen implements Chessplayer{
    public void moves(){
        System.out.println("Queen moves in all directions");
    }
}

class Rook implements Chessplayer{
    public void moves(){
        System.out.println("Rook moves in straight lines");
    }
}
class King implements Chessplayer{
    public void moves(){
        System.out.println("King moves one step in any direction");
    }
}
