package LeetCode_Daily;

public class UnderscoreNames {
    public static void main(String[] args) {
        String name = "Max Sum of a Pair With Equal Sum of Digits";
        addUnderscores(name);
    }

    private static String addUnderscores(String name){
        String replacedName = name.replace(" ", "_");
        System.out.println(replacedName);
        return name;
    }

}
