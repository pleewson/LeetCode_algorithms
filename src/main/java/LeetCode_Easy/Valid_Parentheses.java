package LeetCode_Easy;

//not accepted

public class Valid_Parentheses {
    public static void main(String[] args) {

        String input = "({{{{}}}))";
        System.out.println(isValid(input));

    }

    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        char[] charArray = s.toCharArray();

        //if first index "close" bracket
        if (charArray[0] == ')' || charArray[0] == ']' || charArray[0] == '}') {
            return false;
        }
        //if last index "open" bracket
        if (charArray[s.length() - 1] == '(' || charArray[s.length() - 1] == '[' || charArray[s.length() - 1] == '{') {
            return false;
        }


        for (int i = 0, j = charArray.length - 1; i < charArray.length - 1; i++, j--) {

            if (charArray[i] == '(') {
                if (charArray[i + 1] == ')' || charArray[j] == ')' || charArray[charArray.length / 2] == ')') {
                } else {
                    return false;
                }
            } else if (charArray[i] == '[') {
                if (charArray[i + 1] == ']' || charArray[j] == ']' || charArray[charArray.length / 2] == ']') {
                } else {
                    return false;
                }
            } else if (charArray[i] == '{') {
                if (charArray[i + 1] == '}' || charArray[j] == '}' || charArray[charArray.length / 2] == '}') {
                } else {
                    return false;
                }


//            } else if (charArray[i] == ')') {
//                if (charArray[i - 1] != '(') {
//                    return false;
//                }
//            } else if (charArray[i] == ']') {
//                if (charArray[i - 1] != '[') {
//                    return false;
//                }
//            } else if (charArray[i] == '}') {
//                if (charArray[i - 1] != '{') {
//                    return false;

            }
        }

        return true;
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