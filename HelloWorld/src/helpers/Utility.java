package helpers;

public class Utility {

    public static boolean isPrimeNumber(int num){
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num == 1 || num == 2){
                return true;
            }
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
