package LeetCode_Easy;

public class Valid_Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        s = s.trim().toLowerCase();
        s = s.replaceAll("\\s", "");
        s = s.replaceAll("\\W", "");
        s = s.replaceAll("_", "");

        sb.append(s);
        sb.reverse();

        String reversedS = sb.toString();

        return s.equals(reversedS);

    }
}
