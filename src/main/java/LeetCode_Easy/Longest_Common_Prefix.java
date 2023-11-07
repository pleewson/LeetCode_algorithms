package LeetCode_Easy;

import java.util.ArrayList;

public class Longest_Common_Prefix {
    public static void main(String[] args) {

        String[] outputArr = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(outputArr));

    }

    public static String longestCommonPrefix(String[] strs){

        ArrayList<String> arrList = new ArrayList<>();

        for(int i = 0; i < strs.length; i++){
            arrList.add(strs[i]);
        }

        //if null -> 0
        int lowestLength = arrList.get(0).length();


        //set lowest length
        for(int i = 0; i < arrList.size(); i++){
            if(lowestLength > arrList.get(i).length()){
                lowestLength = arrList.get(i).length();
            }
        }

        System.out.println(lowestLength);
//*** check all i < lowestLength


//            if(strs.length == 3){
//                str1 = strs[0];
//                str2 = strs[1];
//                str3 = strs[2];
//
//
//            }else if(strs.length == 2){
//                str1 = strs[0];
//                str2 = strs[1];
//            }else if(strs.length == 1){
//                return strs[0];
//            }else if(strs.length == 0){
//                return "";
//            }
//
//            if(str1 == "" || str2 == "" || str3 == ""){
//                return "";
//            }
//
//
//        int largestLength = 0;
//
//        if(str1.length() <= str2.length()  &&  str1.length() <= str3.length()){
//            largestLength = str1.length();
//        }else if(str2.length() <= str1.length()  &&  str2.length() <= str3.length()){
//            largestLength = str2.length();
//        }else{
//            largestLength = str3.length();
//        }
//
//
//        int a = 0;
//
//        String output = "";
//
//
//
//
//                while(true){
//                    if(str1.charAt(a) == str2.charAt(a)  &&  str1.charAt(a) == str3.charAt(a)  &&  str2.charAt(a) == str3.charAt(a)){
//                        output += str1.charAt(a);
//                    }else{
//                        break;
//                    }
//
//                    if(a < largestLength-1) {
//                        a++;
//                    }else{
//                        break;
//                    }
//
//                    }
                return "";
                }
    }

