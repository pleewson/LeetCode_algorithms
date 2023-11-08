package LeetCode_Easy;

import java.util.ArrayList;

public class Longest_Common_Prefix {
    public static void main(String[] args) {

        //["abaa","abc","abca"] not work
        String[] outputArr = {"acc","drakula","aaba",""};
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


            //head method
            for (int i = 0; i < arrList.size(); i++) {
                if(arrList.get(i) == ""){
                    return "";
                }

                int sub = 0;
                int j = 0;

                if (output.length() > 1) {

//you must change it for output.length somehow. but first you must have length of shortest arrList value to not so as to not extend length of String
                while(j < lowestLength) {
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

