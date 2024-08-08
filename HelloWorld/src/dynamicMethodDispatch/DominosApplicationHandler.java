package dynamicMethodDispatch;

import dynamicMethodDispatch.DominosShop.*;
import dynamicMethodDispatch.constants.pizzaTypes;
import dynamicMethodDispatch.orderDelivery.DeliveryAgentHandler;

public class DominosApplicationHandler {

    public static void main(String args[]) throws Exception {
        // Getting this from API or something
        String itemName = "HEAVENs";

        // detect the type of item and create an object for the same
        Item item = new Coke(itemName);

        // Get the shop from which the delivery takes the less time.
        System.out.println("*********\nOrder is placed and will be returned in so so time....\n********\n");
        DeliverShopHandler shopHandler = new DeliverShopHandler(item);

        // Assign it to the delivery agent available - getting this data from DB
        String deliveryAgentName = "Madhav";
        DeliveryAgentHandler deliveryAgentHandler = new DeliveryAgentHandler(shopHandler, deliveryAgentName);

        // Ask delivery agent to order it
        deliveryAgentHandler.orderIt();

        System.out.println(DominosApplicationHandler.class.getName() +"Order delivered successfully to the customer...");


    }


}
