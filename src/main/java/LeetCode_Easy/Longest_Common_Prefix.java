package LeetCode_Easy;

import java.util.ArrayList;

public class Longest_Common_Prefix {
    public static void main(String[] args) {

        String[] outputArr = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(outputArr));

    }

    public static String longestCommonPrefix(String[] strs){
        if(strs.length > 0) {

            //add strings into ArrayList
            ArrayList<String> arrList = new ArrayList<>();
            for (int i = 0; i < strs.length; i++) {
                arrList.add(strs[i]);
            }

            String output = arrList.get(0);


            //set lowest length
            int lowestLength = arrList.get(0).length();

            for (int i = 0; i < arrList.size(); i++) {
                if (lowestLength > arrList.get(i).length()) {
                    lowestLength = arrList.get(i).length();
                }
            }


            //if length == 1
            if (output.length() == 1) {
            for(int i = 0; i < arrList.size(); i++) {
                    if (output.charAt(0) == arrList.get(i).charAt(0)) {
                        output = String.valueOf(arrList.get(i).charAt(0));
                    }else{
                        return "";
                    }
                }
            return output;
            }

            //if any value is ""
            int value;
            for(int i = 0; i < arrList.size(); i++){
                value = arrList.get(i).length();
                if(value == 0){
                    return "";
                }
            }

            //making length of output = lowestlength (in letters) ofc
            int sub = 0;

            for(int Y = 0; Y < lowestLength; Y++) {
                if (output.charAt(0) != arrList.get(1).charAt(0)) {
                    return "";
                } else if (output.charAt(Y) == arrList.get(1).charAt(Y)) {
                    sub++;
                } else {
                    output.substring(0, sub);
                    break;
                }
            }
            output = output.substring(0, sub);

            //checking everyLetter < output.length();
            for (int i = 0; i < arrList.size(); i++) {
                if(arrList.get(i) == ""){   //i think i can delete it
                    return "";
                }


                if (output.length() > 1) {

                    sub = 0;
                    int j = 0;

                    while (j < output.length()) {
                        if (output.charAt(0) != arrList.get(i).charAt(0)) {
                            return "";
                        } else if (output.charAt(j) == arrList.get(i).charAt(j)) {
                            sub++;
                            j++;
                        } else {
                            output.substring(0, sub);
                            break;
                        }
                    }

                    output = output.substring(0, sub);

                }else{
                    if(output.charAt(0) == arrList.get(i).charAt(0)){
                     }else{
                        return "";
                    }
                }
            }

            return output;
        }

        return null;

                }
    }

