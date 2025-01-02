package LeetCode_Daily.year2024.september2024;

//https://leetcode.com/problems/count-the-number-of-consistent-strings/description/?envType=daily-question&envId=2024-09-12
public class Count_the_Number_of_Consistent_Strings {
    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad", "bd", "aaab", "baa", "badab"};

        System.out.println(countConsistentStrings(allowed,words));

    }

    public static int countConsistentStrings(String allowed, String[] words) {
        char[] allowedCharArr = allowed.toCharArray();
        int counter = 0;

        for(String word : words){
            char[] wordCharArr = word.toCharArray();
            int lengthChecker = 0;
            for(int i = 0; i < wordCharArr.length; i++){
                for(int j = 0; j < allowedCharArr.length; j++){
                    if(wordCharArr[i] == allowedCharArr[j]){
                        lengthChecker++;
                        break;
                    }
                }
            }
            if (lengthChecker == word.length()){
                counter++;
            }
        }
        return counter;
    }
}
