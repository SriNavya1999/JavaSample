package desighPatterns.creationalPattern.factoryMethodPattern;

/**
 * Suppose you are developing a logistics application that needs to create different types of transportation vehicles based on certain conditions. The object creation process is complex and depends on various parameters such as destination distance and cargo weight.
 */


interface Vehicles{
    void deliver();
}

class Truck implements Vehicles{
    @Override
    public void deliver(){
        System.out.println("Delivery done by Truck");
    }
}

class Ship implements Vehicles{
    @Override
    public void deliver(){
        System.out.println("Delivery done by Ship");
    }
}


abstract class Logistics{
    abstract Vehicles decideVehicle(Double distance, Double weight);

    public void planDelivery(Double distance, Double weight){
        Vehicles vehicles = decideVehicle(distance, weight);
        vehicles.deliver();
    }


}

class DeepLogistics extends  Logistics{

    @Override
    Vehicles decideVehicle(Double distance, Double weight) {
        if(distance > 10000 && weight > 100)
            return new Ship();
        else
            return new Truck();
    }
}


public class DeliveryAgent {

    public static void main(String []args){
        Logistics logistics = new DeepLogistics();
        logistics.planDelivery(100000.00, 1000.00);
    }

}
