package dynamicMethodDispatch.DominosShop;

public class Coke extends Item{

    public Coke(String itemName) {
        super(itemName);
    }

    public boolean cookItem(){
        System.out.println( getClass().getName()+ ": " + getItemName()+" is getting cooked....");
        return true;
    }

    public boolean packItem(){
        System.out.println(getClass().getName()+ ": " + getItemName()+ " Coke is getting packed...");
        return true;
    }


}