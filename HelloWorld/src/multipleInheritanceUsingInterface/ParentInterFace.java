package multipleInheritanceUsingInterface;

public interface ParentInterFace {
    // abstract function
    void abstractFunPresentInAllInterfaces();

    void abstractFunPresentInParentInterfaceOnly();

    void abstractFunPresentInParentAndChild1Interface();

    default void defaultFunPresentInParentInterface(){
        System.out.println(">> defaultFunPresentInParentInterface() implementation from ParentInterface");
    }

    default void defaultFunOverriddenByChildInterface1(){
        System.out.println(">> defaultFunOverriddenByChildInterface1() implementation from ParentInterface");
    }

    default void defaultFunOverriddenByChildInterface2(){
        System.out.println(">> defaultFunOverriddenByChildInterface2() implementation from ParentInterface");
    }

    default void defaultFunOverriddenByBothChildInterfaces(){
        System.out.println(">> defaultFunOverriddenByBothChildInterfaces() implementation from ParentInterface");
    }
}
