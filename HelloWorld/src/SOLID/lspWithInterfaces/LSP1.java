package SOLID.lspWithInterfaces;

/**
 * We need to understand that we cannot extend Square from Rectangle without violating LSP. We need to use a common interface "Shape" for Rectangle and Square which is going to contain all the methods in common (or) we need to declare Rectangle object inside Square.<p>
 *     Here we are declaring a common interface for Square and Rectangle CALLED "Shape"
 * </p>
 */

interface Shape{
    void setBreath(int i);
    void setLength(int i);
    int getBreath();
    int getLength();
    int area();
}
class Rectangle implements Shape{
    private int length, breath;

    public void setBreath(int breath) {
        this.breath = breath;
    }

    public void setLength(int length){
        this.length = length;
    }

    public int getLength(){
        return length;
    }

    public int getBreath() {
        return this.breath;
    }

    public int area(){
        return this.breath * this.length;
    }
}

class Square implements Shape{

    private int side;

    public void setBreath(int breath) {
        this.side = breath;
    }

    public void setLength(int length){
        this.side = length;
    }

    public int getLength(){
        return side;
    }

    public int getBreath() {
        return this.side;
    }

    public int area(){
        return this.side * this.side;
    }

}


public class LSP1 {
    public static void main(String [] args){
        // Below code now isn't violating LSP

        Shape rectangle = new Rectangle();
        rectangle.setBreath(10);
        rectangle.setLength(22);
        System.out.println(rectangle.area());   // 220

        Shape square = new Square();
        square.setBreath(10);
        System.out.println(square.area());  // 100


    }
}
