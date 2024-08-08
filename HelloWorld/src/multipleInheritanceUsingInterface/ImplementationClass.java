package multipleInheritanceUsingInterface;


public class ImplementationClass implements  ChildInterface1, ChildInterface2 {

    /**
     * Implementation class must provide implementation for all the abstract functions present in immediate parents.
     */

    public void abstractFunPresentInChildInterface1Only(){
        System.out.println(">> abstractFunPresentInChildInterface1Only() implementation from ImplementationClass");
    }

    /**
     * Since this is an abstract fun, implementation is provided in implementation class.
     * One single implementation function in implementation class will suffice to override all the same type of function declarations present in different interfaces that are inherited by implementation class.
     * Eg: abstractFun() implementation in ImplementationClass will be overriding the abstractFun() declarations from ChildInterface1, ChildInterface2, ParentInterface.
     */
    public void abstractFunPresentInAllInterfaces() {
        System.out.println(">> abstractFunPresentInAllInterfaces() implementation from ImplementationClass");
    }

    /**
     * Since this is an abstract fun, implementation is provided in implementation class.
     * Implementation class needs to provide implementations for all the abstract functions present in all its multilevel interfaces
     */

    public void abstractFunPresentInParentInterfaceOnly() {
        System.out.println(">> abstractFunPresentInParentInterfaceOnly() implementation from ImplementationClass");
    }


    /**
     * If Default implementation is provided for same function declaration in both the immediate parent interfaces,
     * Implementation must be provided for that method in Implementation class, else there will be compile time error.
     * Good thing is we can call the parent interfaces from Implementation class using superKeyword.
     */
    public void defaultFunOverriddenByBothChildInterfaces(){
        System.out.println(">> defaultFunOverriddenByBothChildInterfaces() implementation from ImplementationClass");
        // Calling the implementation from ChildInterface1.
        ChildInterface1.super.defaultFunOverriddenByBothChildInterfaces();
        // Calling the implementation from ChildInterface1.
        ChildInterface2.super.defaultFunOverriddenByBothChildInterfaces();
    }

    /**
     * If same function is declared in one immediate parent interface and is implemented as default fun in another immediate parent interface, then
     * Implementation must be provided for that method in Implementation class, else there will be compile time error.
     * Good thing is we can call the parent interfaces from Implementation class using superKeyword.
     */

    public void defaultFunInBothTheInterfaces(){
        System.out.println(">> defaultFunInBothTheInterfaces() implementation from ImplementationClass");
        ChildInterface2.super.defaultFunInBothTheInterfaces();
    }


    public static void main(String args[]){
        ImplementationClass implementationClass = new ImplementationClass();
//        implementationClass.abstractFunPresentInChildInterface1Only();
//        implementationClass.abstractFunPresentInAllInterfaces();
//        implementationClass.abstractFunPresentInParentInterfaceOnly();
//
//        // Since this is a default function, there is no need to provide implementation in Implementation class.
//        implementationClass.defaultFunPresentInParentInterface();
//        implementationClass.defaultFunOverriddenByChildInterface1();    // Since this fun in parentInterface is being overridden by child, child function will get executed.
//        implementationClass.defaultFunOverriddenByChildInterface2();    // Since this fun in parentInterface is being overridden by child, child function will get executed.
//        implementationClass.defaultFunOverriddenByBothChildInterfaces();
//        implementationClass.defaultFunInBothTheInterfaces();

        implementationClass.abstractFunPresentInParentAndChild1Interface();



    }

}
