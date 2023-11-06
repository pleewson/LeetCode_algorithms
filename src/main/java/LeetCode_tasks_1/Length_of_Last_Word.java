package LeetCode_tasks_1;

public class Length_of_Last_Word {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("      a"));
    }

    public static int lengthOfLastWord(String s){
        s = s.trim();

        int wordCounter = 0;

        for(int i = s.length()-1; i >= 0; i--){
            if(s.charAt(i) == ' '){
                break;
            }else{
                wordCounter++;
            }
        }
        return wordCounter;
    }

}
