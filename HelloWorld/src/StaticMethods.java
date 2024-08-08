public class StaticMethods {

    static int a = 10, b = 20;

//    static {
//        Base1 base = new Derived();
//        System.out.println(base.fun(a,b));
//    }

    static void A(){
        Base base = new Derived();
        b = base.fun(a, b);
    }

    public static void main (String args[]){
//        Base1 base = new Base1();

    }

}

class Base{
    public int fun(int a, int b){
        return a+b;
    }
    public static void display(){
        System.out.println("I'm inside \"Base1\" class display function\n");
    }
}

class Derived extends Base {
//    int app = 100;

    public int fun(int a, int b){
//        System.out.println(app);
        return 10000;
    }
    public static void display(){
        System.out.println("I'm inside \"Derived\" class display function\n");
    }
}