package clone;

class A implements Cloneable{
    int x = 10, y = 10;
    A(){
        System.out.println("Constructor of A:: " + "x = " + x + ", y = " + y);
    }

    A(int x, int y){
        this.x = x;
        this.y = y;
        System.out.println("Constructor of A:: " + "x = " + x + ", y = " + y);
    }

    @Override
    public Object clone() throws  CloneNotSupportedException{
       return super.clone();
    }

    @Override
    public String toString(){
        System.out.print("[x = " + x + ", y = " + y + ", " + super.toString() + "], ");
        return super.toString();
    }
}

class ShallowCopy implements Cloneable{
    int i = 20, j = 20;
    A a = new A();

    ShallowCopy(int i, int j, A a) throws CloneNotSupportedException{
        this.i = i;
        this.j = j;
        this.a =  (A) a.clone();
    }

    // Clone function supporting shallow copy -> original and cloned object's ref variable 'a' will be pointing to same object.
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    public String toString(){
        a.toString();
        System.out.println("i = " + i + ", j = " + j + ", " + super.toString());
        return super.toString();
    }
}

class DeepCopy implements Cloneable{
    int i = 20, j = 20;
    A a = new A();

    DeepCopy(int i, int j, A a) throws CloneNotSupportedException{
        this.i = i;
        this.j = j;
        this.a =  (A) a.clone();
    }

    // Original and cloned object's ref variable 'a' will be pointing to different object with same member values.
    @Override
    public Object clone() throws CloneNotSupportedException{
        DeepCopy deepCopy = (DeepCopy) super.clone();
        deepCopy.a = (A) a.clone();
        return deepCopy;
    }

    @Override
    public String toString(){
        a.toString();
        System.out.print("i = " + i + ", j = " + j  + ", " + super.toString() + ", ");
        return super.toString();
    }
}

class Derived extends DeepCopy{
    String str = "Navya";
    A special = new A(99, 99);

    Derived(String str) throws CloneNotSupportedException{
        super(50, 50, new A());
        this.str = str;
    }

    @Override
    public String toString(){
        System.out.print("Str = " + str + ", ");
        special.toString();
        super.toString();
        return this.getClass().getName() + "@" + this.hashCode();
    }

    // Without this, the special object in Derived will undergo shallow copy.
    @Override
    public Object clone() throws CloneNotSupportedException{
        Derived derived = (Derived) super.clone();
        derived.special = (A) special.clone();
        return derived;
    }
}

public class Main {

public static void main(String[] args) throws CloneNotSupportedException{

        A a = new A();
        a.x = 100;
        a.y = 100;
        a.toString();
        System.out.println("\n\nShallow Copy Example:");

        ShallowCopy shallowCopy = new ShallowCopy(40, 40, a);
        ShallowCopy shallowCopy1 = (ShallowCopy) shallowCopy.clone();

        shallowCopy.toString();
        shallowCopy1.toString();

        System.out.println("\nChanging the values in shallowCopy1:");

        shallowCopy1.a.x = 666;
        shallowCopy1.i = 200;

        shallowCopy.toString();
        shallowCopy1.toString();

        System.out.println("\n\nDeep Copy Example:");
        DeepCopy deepCopy = new DeepCopy(30, 30, a);
        DeepCopy deepCopy1 = (DeepCopy) deepCopy.clone();

        deepCopy.toString();
        System.out.println();
        deepCopy1.toString();

        System.out.println("\n\nChanging the values in deepCopy1:");

        deepCopy1.a.x = 555;
        deepCopy1.i = 400;

        deepCopy.toString();
        System.out.println();
        deepCopy1.toString();

        System.out.println("\n\n\nClone function in parent class Example:");

        Derived derived = new Derived("Chandan");
        Derived derived1 = (Derived) derived.clone();

        derived.toString();
        System.out.println();
        derived1.toString();

        System.out.println("\n\nChanging the values in derived1:");
        derived1.a.x = 222;
        derived1.str = "Navya";
        derived1.special.x = 333;

        derived.toString();
        System.out.println();
        derived1.toString();
    }

}

