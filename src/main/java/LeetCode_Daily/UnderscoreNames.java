package LeetCode_Daily;

public class UnderscoreNames {
    public static void main(String[] args) {
        String name = "Find the Prefix Common Array of Two Arrays";
        addUnderscores(name);
    }

    private static String addUnderscores(String name){
        String replacedName = name.replace(" ", "_");
        System.out.println(replacedName);
        return name;
    }

}
