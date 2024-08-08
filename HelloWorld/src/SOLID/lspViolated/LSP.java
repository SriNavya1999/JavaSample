package SOLID.lspViolated;

/**
 * When Square class is extending Rectangle class, LSP is violated
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

class Square extends Rectangle{
    @Override
    public void setBreath(int breath) {
        super.setBreath(breath);
        super.setLength(breath);
    }

    @Override
    public void setLength(int length){
        super.setLength(length);
        super.setBreath(length);
    }
}

public class LSP {
    public static void main(String [] args){
        Rectangle rectangle = new Rectangle();
        rectangle.setBreath(10);
        rectangle.setLength(22);
        System.out.println(rectangle.area());   // 220

        Square square = new Square();
        square.setBreath(10);
        System.out.println(square.area());  // 100

        // LSP is violated here...
        Rectangle rectangle1 = new Square();
        rectangle1.setBreath(10);
        rectangle1.setLength(22);
        System.out.println(rectangle1.area());  // Expected 220 but obtained 484

    }
}
