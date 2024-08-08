package dynamicMethodDispatch.DominosShop;

public class Pizza extends Item{

    public Pizza(String itemName) {
        super(itemName);
    }
    public boolean cookItem(){
        System.out.println( getClass().getName()+ ": "+ getItemName()+" is getting cooked....");
        return true;
    }

    public boolean packItem(){
        System.out.println(getClass().getName()+ ": "+ getItemName()+" is getting packed...");
        return true;
    }

}
