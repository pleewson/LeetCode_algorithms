package LeetCode_Easy;

import java.util.Stack;

public class test {

    public static void main(String[] args) {


        int a = 124;
        int sum = 0;

       for(int i = 0; i < 3; i++){
           sum += a % 10;
           a /= 10;
       }

        System.out.println(sum);
    }


//    //metody klasy test
//    public void instantMethod(){
//        System.out.println("instancyjna metoda zostala wywolana");
//    }
//
//    public static void staticMethod(){
//        System.out.println("statyczna metoda zostala wywolana");
//    }
}