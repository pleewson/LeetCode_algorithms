package LeetCode_Easy;

import java.util.ArrayList;

public class Longest_Common_Prefix {
    public static void main(String[] args) {

        String[] outputArr = {"acc","aaa","aaba"};
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


            //head method
            for (int i = 0; i < arrList.size(); i++) {
                int sub = 0;
                int j = 0;

//think between //  //

                while(j < lowestLength) {
       //             if (j < output.length()) {
                        if (output.charAt(0) != arrList.get(i).charAt(0)) {
                            return "";
                        } else if (output.charAt(j) == arrList.get(i).charAt(j)) {
                            sub++;
                            j++;
                        } else {
                            output.substring(0, sub);
                            break;
                        }

                        output = output.substring(0, sub);
      //              }
                }
            }

            return output;
        }

        return null;

                }
    }

