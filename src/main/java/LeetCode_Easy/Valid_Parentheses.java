package LeetCode_Easy;

public class Valid_Parentheses {
    public static void main(String[] args) {

    }

    public static boolean isValid(String s) {
        if(s.length() < 1){
            return false;
        }

        char[] charArray = s.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '(') {
                if (charArray[i + 1] != ')') {
                    return false;
                }
            } else if (charArray[i] == '[') {
                if (charArray[i + 1] != ']') {
                    return false;
                }
            } else if (charArray[i] == '{') {
                if (charArray[i + 1] != '}'){
                    return false;
                }
            }
        }

        return false;
    }
}


//Example 1:
//
//Input: s = "()"
//Output: true
//Example 2:
//
//Input: s = "()[]{}"
//Output: true
//Example 3:
//
//Input: s = "(]"
//Output: false