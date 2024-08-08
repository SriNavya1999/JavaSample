package dynamicMethodDispatch.orderDelivery;

import dynamicMethodDispatch.DominosShop.DeliverShopHandler;
import dynamicMethodDispatch.DominosShop.Item;

public class DeliveryAgentHandler{

    private final String deliveryAgentName;
    DeliverShopHandler shop;

    public DeliveryAgentHandler(DeliverShopHandler shop, String deliveryAgentName){
        this.shop = shop;
        this.deliveryAgentName = deliveryAgentName;
    }

    public void orderIt() throws Exception {
        System.out.println(getClass().getName() + ": Given the Order to the Pizza Shop - ");
        if(shop.takeOrder()){
            System.out.println(getClass().getName() + ": Order successfully taken, delivering the order to customer.....");
        }
        else{
            throw new Exception("Order failed...");
        }
    }
}
