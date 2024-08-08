package nestedClasses;

public class Main {

    private static int privateVar = 10;

    public static void main(String [] args){
        int effectivelyFinalVar = 10;

        OuterClass outerClass = new OuterClass();

        // Object of static nested class can be created without creating object of the outer class.
        OuterClass.StaticNestedClass staticNestedClass = new OuterClass.StaticNestedClass();

        // Creation of object of the inner class depends on the outer class object => regular inner class belongs to instance of outer class and not to the outer class.
        OuterClass.RegularInnerClass regularInnerClass = outerClass.new RegularInnerClass();

        OuterClass.StaticNestedClass.main(null);
        regularInnerClass.display();


//      To access the static variables and static member methods of regular inner class, W doesn't need top create an object of inner class but an object of the outer class is required.
        System.out.println(OuterClass.RegularInnerClass.staticVariable);
        OuterClass.RegularInnerClass.main(null);

        OuterClass.function();


        // Anonymous Inner Class extending Outer Class
        OuterClass outerClass1 = new OuterClass(){
            // Override fun()
            @Override
            void fun(){
                System.out.println("This is Anonymous inner class fun.");
                // It cannot access the private members of the OuterClass, it can access the private members of the Main & can access final or effectively final members of main()
                System.out.println("private member of main: " + privateVar + "\n, effectively Final variable of outside block: " + effectivelyFinalVar);
            }
        };

        // Anonymous Inner Class implementing Interface
        Interface interface1 = new Interface(){
            @Override
            public void function(){
                System.out.println("This is Anonymous Inner Class function.");
            }
        };




    }
}
