package LeetCode_Daily;

public class UnderscoreNames {
    public static void main(String[] args) {
        String name = "Find Elements in a Contaminated Binary Tree";
        addUnderscores(name);
    }

    private static String addUnderscores(String name){
        String replacedName = name.replace(" ", "_");
        System.out.println(replacedName);
        return name;
    }

}
