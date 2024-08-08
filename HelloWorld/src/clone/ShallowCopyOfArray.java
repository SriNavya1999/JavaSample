package clone;

class Test{
    int i = 10;
}

public class ShallowCopyOfArray {

    public static void main(String[] args){
        Test [] array = {new Test(), new Test(), new Test()};

        // ShallowCopy of array with elements as Object types.
        Test[] clonedArray = array.clone();

        System.out.println(array + " \n"+ clonedArray);

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " " + array[i].i + " ");
        }
        System.out.println();

        for(int i = 0; i < array.length; i++){
            System.out.print(clonedArray[i] + " " + clonedArray[i].i + " ");
        }
    }
}
