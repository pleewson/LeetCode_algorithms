package LeetCode_Daily;

import java.util.*;

public class test {

    public static void main(String[] args) {

        int a = 915;
        int b = 305;

        System.out.println(findGCM(a,b));

    }

    public static int findGCM(int a, int b){
        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();
        for(int i = 1; i <= a || i <= b; i++){
            if(a%i == 0){
                listA.add(i);
            }
            if(b%i == 0){
                listB.add(i);
            }
        }


        if(listA.size() < listB.size()){
            for(Integer numA : listA.reversed()){
                for(Integer numB : listB.reversed()){
                    if(numA < numB){
                        continue;
                    }
                    if (numA.equals(numB)){
                        return numA;
                    }
                }
            }
        }else{
            for(Integer numB : listB.reversed()){
                for(Integer numA : listA.reversed()){
                    if(numB < numA){
                        continue;
                    }
                    System.out.println("A " + numA + " B " + numB);
                    if (numB.equals(numA)){
                        return numB;
                    }

                }
            }
        }

        return -1;
    }


}
