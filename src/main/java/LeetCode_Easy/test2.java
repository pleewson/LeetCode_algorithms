package LeetCode_Easy;

public class test2 {

    private String name = "pietrek";
    private int zmiennaInstancyjna;
    private static int statycznaZmienna;


    public String getName(){
        return this.name;
    }

    public void instantMethod(){
        System.out.println("instancyjna metoda zostala wywolana");
    }

    public static void staticMethod(){
        System.out.println("statyczna metoda zostala wywolana");
    }

    //lesson.coderslab_02
}
