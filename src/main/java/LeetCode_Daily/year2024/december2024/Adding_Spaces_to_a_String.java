package LeetCode_Daily.year2024.december2024;

public class Adding_Spaces_to_a_String {
    public static void main(String[] args) {
        String s = "ezixkFLjdbxrDowLVGYvdtBrguAAJVM";
        int[] spaces = {23};
        System.out.println(addSpaces(s, spaces));
    }


    public static String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();

        if (spaces.length == 1 && (spaces[0] == 0)) {
            sb.append(" ").append(s);
        } else if (spaces.length == 1) {
            sb.append(s.substring(0, spaces[0])).append(" ").append(s.substring(spaces[0], s.length()));
        } else {

            for (int i = 0; i < spaces.length; i++) {
                if (i == 0) {
                    sb.append(s.substring(0, spaces[i])).append(" ");
                } else if (i == spaces.length - 1) {
                    sb.append(s.substring(spaces[i - 1], spaces[i])).append(" ");
                    sb.append(s.substring(spaces[i], s.length()));
                } else {
                    sb.append(s.substring(spaces[i - 1], spaces[i])).append(" ");
                }
            }
        }
        return sb.toString();
    }
}
