package dynamicMethodDispatch.DominosShop;

public class Burger extends Item{

    public Burger(String itemName) {
        super(itemName);
    }

    public boolean cookItem(){
        System.out.println( getClass().getName()+ ": "+ getItemName()+" Burger is getting cooked....");
        return true;
    }

    public boolean packItem(){
        System.out.println(getClass().getName()+ ": "+ getItemName()+" Burger is getting packed...");
        return true;
    }


}