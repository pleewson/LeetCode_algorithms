package LeetCode_Daily;

public class UnderscoreNames {
    public static void main(String[] args) {
        String name = "Find Numbers with Even Number of Digits";
        addUnderscores(name);
    }

    private static String addUnderscores(String name){
        String replacedName = name.replace(" ", "_");
        System.out.println(replacedName);
        return name;
    }

}
