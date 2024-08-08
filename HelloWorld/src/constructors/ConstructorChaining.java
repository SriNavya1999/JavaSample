package constructors;
//
//class Base2{
//    int i = 10;
//    Base2(int i){
//        this.i = i;
//    }
//}


class Base1{
    int i = 10;
    Base1(){
        System.out.println("Base class Constructor");
    }

    /** using this copy constructor alone without explicit default constructor will result in error as there is not default constructor provided implicitly now.
    */
     Base1(Base1 b){
        this.i = b.i;
    }
}
public class ConstructorChaining extends Base1
{
    // default constructor 1
    // default constructor will call another constructor
    // using this keyword from same class
    ConstructorChaining()
    {
        // calls constructor 2
        this(5);
        System.out.println("The Default constructor");
    }

    // parameterized constructor 2
    ConstructorChaining(int x)
    {
        // calls constructor 3
        this(5, 15);
        System.out.println(x);
    }

    // parameterized constructor 3
    ConstructorChaining(int x, int y)
    {
        // The default constructor of the Base1 class will be called here implicitly by the compiler using  super().
        System.out.println(x * y);
    }

    public static void main(String args[])
    {
        // invokes default constructor first
        new ConstructorChaining();


    }
}