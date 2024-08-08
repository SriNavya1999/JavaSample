package helpers;

import java.util.*;
import java.lang.String;

// This is also called as separate chaining
public class OpenHashing<T>{

    private ArrayList<T> hashTable[];
    private int sizeOfHashMap;

    public OpenHashing(int size){
        hashTable = new ArrayList[size];
        sizeOfHashMap = size;
        for(int i = 0; i < sizeOfHashMap; i++){
            hashTable[i] = new ArrayList<>();
//            System.out.println(hashTable[i].size());
        }
    }

    public int hashFun(T element){
        return (int) Math.sqrt((Integer) element) % sizeOfHashMap;
    }

    public void insert(T[] array, int size) {
        for(int i = 0; i < size; i++){
            int index = hashFun(array[i]);
            hashTable[index].add(array[i]);
        }
    }

    public void search(T integer){
        int index = hashFun(integer);
        for(int i = 0; i < hashTable[index].size(); i++){
            if(hashTable[index].get(i).equals(integer)){
                System.out.println("Element found at array index " + index + ", Linked list index = " + i);
                return;
            }
        }
        System.out.println("Element not found");
    }

    public void printHashTable(){
        for(int i = 0; i < sizeOfHashMap; i++){
            System.out.print(i + " : " );
            for(int j = 0; j < hashTable[i].size(); j++){
                System.out.print(hashTable[i].get(j) + " -> ");
            }
            System.out.println();
        }
    }

     public static void main(String args[]){
        Integer[] array = {1, 2, 33, 44, 55, 66};
        OpenHashing<Integer> hashMap = new OpenHashing<>(array.length);
        hashMap.insert(array, array.length);
        hashMap.printHashTable();
        hashMap.search(array[4]);
     }
}
