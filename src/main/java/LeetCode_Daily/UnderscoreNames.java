package LeetCode_Daily;

public class UnderscoreNames {
    public static void main(String[] args) {
        String name = "Minimum Operations to Exceed Threshold Value II";
        addUnderscores(name);
    }

    private static String addUnderscores(String name){
        String replacedName = name.replace(" ", "_");
        System.out.println(replacedName);
        return name;
    }

}
