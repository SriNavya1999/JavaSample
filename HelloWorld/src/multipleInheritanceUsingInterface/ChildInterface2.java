package multipleInheritanceUsingInterface;

public interface ChildInterface2 extends ParentInterFace{
    // abstract function (overriding the parent interface)
    void abstractFunPresentInAllInterfaces();

    default void defaultFunOverriddenByChildInterface2(){
        System.out.println(">> defaultFunOverriddenByChildInterface2() implementation from ChildInterface2");
    }

    default void defaultFunOverriddenByBothChildInterfaces(){
        System.out.println(">> defaultFunOverriddenByBothChildInterfaces() implementation from ChildInterface2");
    }

    default void defaultFunInBothTheInterfaces(){
        System.out.println(">> defaultFunInBothTheInterfaces() implementation from ChildInterface2");
    }

}
