public class UnderscoreNames {
    public static void main(String[] args) {
        String name = "Maximum Erasure Value";
        addUnderscores(name);
    }

    private static String addUnderscores(String name){
        String replacedName = name.replace(" ", "_");
        System.out.println(replacedName);
        return name;
    }

}
