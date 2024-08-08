package multipleInheritanceUsingInterface;

public interface ChildInterface1 extends ParentInterFace {
    // abstract function (overriding the parent interface)
    void abstractFunPresentInAllInterfaces();

    void abstractFunPresentInChildInterface1Only();

    default void abstractFunPresentInParentAndChild1Interface(){
        System.out.println(">> abstractFunPresentInParentAndChild1Interface() implementation from ChildInterface1");
    }

    default void defaultFunOverriddenByChildInterface1(){
        System.out.println(">> defaultFunOverriddenByChildInterface1() implementation from ChildInterface1");
    }

    default void defaultFunOverriddenByBothChildInterfaces(){
        System.out.println(">> defaultFunOverriddenByBothChildInterfaces() implementation from ChildInterface1");
    }

    void defaultFunInBothTheInterfaces();


}
