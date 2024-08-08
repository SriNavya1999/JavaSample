package dynamicMethodDispatch.DominosShop;

import dynamicMethodDispatch.constants.pizzaTypes;

 public class Item {
     private final String itemName;

     public Item(String itemName){
         this.itemName = itemName;
     }

     public boolean cookItem(){
         System.out.println( getClass().getName()+ ": "+ getItemName()+" is getting cooked....");
         return true;
     }

     public boolean packItem(){
         System.out.println(getClass().getName()+ ": "+ getItemName()+" is getting packed...");
         return true;
     }

     public String getItemName(){ return itemName;}

 }