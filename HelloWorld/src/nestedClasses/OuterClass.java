package nestedClasses;

public class OuterClass {

    private static int i = 10;
    private int j = 20;

    static class StaticNestedClass{

         /**
          * Can access only static members/ methods of the outer class directly.<p>
          * Can have static methods along with main method.
          *
          */
        public static void main(String [] args){
            System.out.println("default static nested classes can have main methods inside them" + i);

//            The below line throws error as static nested classes cannot access non-static members of the outer class directly.
//            System.out.println("default static nested classes can have main methods inside them" + j);

//            If we want to access the non-static members of the outer class, We need to create an object of the outer class and using which we need to access as shown below.
            OuterClass outerClass = new OuterClass();
            System.out.println(outerClass.j);
        }

    }

    public class RegularInnerClass{

        /** Can access all the members of the Outer class directly.
         *
         */
        void display(){
            System.out.println(i + j);
        }

        /** We cannot create static members/ methods inside Inner class upto Java 15. Java 16 and later versions supports static members inside inner classes.
         * <p> JVM cannot call the main method inside the regular inner class
         * </p>
         */
        static int staticVariable = 10;
        public static void main(String [] args){
            System.out.println(i);
        }
    }

    static void function(){
        int effectivelyFinalVariable = 10;

        class LocalInnerClass{
            int var = effectivelyFinalVariable;
            static int staticVar = 25;

            void fun(){
                staticVar = 26;
                 System.out.println(var + i + staticVar);
             }
         }

         LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.fun();
    }

    void fun(){
        System.out.println("This is Outer class fun");
    }
}


