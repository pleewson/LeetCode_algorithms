public class UnderscoreNames {
    public static void main(String[] args) {
        String name = "Finding Pairs With a Certain Sum";
        addUnderscores(name);
    }

    private static String addUnderscores(String name){
        String replacedName = name.replace(" ", "_");
        System.out.println(replacedName);
        return name;
    }

}
