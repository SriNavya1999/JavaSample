
enum Colour{
    RED,
    BLUE,
    GREEN
}


public class playWithEnum {
    static Colour[] colours = Colour.values();

    public static void main(String [] args){
        for(Colour colour: colours){
            System.out.println(colour.toString());
        }
        System.out.println(Colour.valueOf("GREEN").hashCode());
    }

}
