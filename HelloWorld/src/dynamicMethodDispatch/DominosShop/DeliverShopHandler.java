package dynamicMethodDispatch.DominosShop;

public class DeliverShopHandler {
    Item item;

    public DeliverShopHandler(Item item){
        this.item = item;
    }

    public boolean takeOrder(){
        boolean b = item.cookItem() && item.packItem();
        if(b){
            System.out.println(getClass().getName() + " : The order "+ item.getItemName() + "is done and is handled to delivery agent......");
        }
        return b;
    }


}
