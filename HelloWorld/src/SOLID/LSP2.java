package SOLID;

/**
 * We need to understand that we cannot extend Square from Rectangle without violating LSP. We need to use a common interface "Shape" for Rectangle and Square which is going to contain all the methods in common (or) we need to declare Rectangle object inside Square.<p>
 *     Here we are declaring a rectangle object inside the Square class.
 * </p>
 */

class Rectangle{
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

class Square{
    Rectangle rectangle = new Rectangle();

    public void setSide(int breath){
        rectangle.setBreath(breath);
        rectangle.setLength(breath);
    }

    public int area(){
        return rectangle.area();
    }


}


public class LSP2 {
    public static void main(String [] args){
        Rectangle rectangle = new Rectangle();
        rectangle.setBreath(10);
        rectangle.setLength(22);
        System.out.println(rectangle.area());   // 220

        Square square = new Square();
        square.setSide(10);
        System.out.println(square.area());  // 100

        // Below code is no longer valid
//        Rectangle rectangle1 = new Square();
//        rectangle1.setBreath(10);
//        rectangle1.setLength(22);
//        System.out.println(rectangle1.area());  // Expected 220 but obtained 484

    }
}
