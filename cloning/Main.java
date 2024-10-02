package com.prachi.cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Human keerat = new Human(12, "Keerat",arr);
        //Human Soha = new Human(keerat);

        //We can clone the object for shallow copy
        try{
            Human Soha = (Human)keerat.clone();
            System.out.println("name of Soha : " + Soha.name + " age: " + Soha.age + " arr: " + Arrays.toString(Soha.arr));

            Soha.name = "Soha";
            Soha.arr[2] = 6;
            System.out.println("name of Soha: " + Soha.name + " age: " + Soha.age + " arr: " + Arrays.toString(Soha.arr));
            System.out.println("name of Keerat: " + keerat.name + " age: " + keerat.age + " arr: " + Arrays.toString(Soha.arr));

        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }

    }
}
