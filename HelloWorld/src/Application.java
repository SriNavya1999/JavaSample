
public class Application {

    int[] array;

    Application(int size) {
        array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = 0;
        }
    }

    public int hashFun(char c) {
        return c - 'a';
    }

    public int[] fun(int[] array, String str) {
        for (int i = 0; i < str.length(); i++) {
            array[hashFun(str.charAt(i))]++;
        }
        return array;
    }

    static {
        System.out.println("Printing content from static block");
    }

    public static void main(String[] args) {
//        String str = "abaac";
//        str.concat("apple");
//        System.out.println(str);
//        Application hello_world = new Application(str.length());
//        hello_world.array = hello_world.fun(hello_world.array, str);
//        for(int i = 0; i < hello_world.array.length; i++){
//            System.out.println(hello_world.array[i]);
//        }

//        int num = -50;
//        if(Helpers.Utility.isPrimeNumber(num)){
//            System.out.println(num +" is prime number");
//        }
//        else
//            System.out.println(num +" is not prime number");



    }
}