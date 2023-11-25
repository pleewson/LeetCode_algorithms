package LeetCode_Easy;

import java.util.Stack;

public class test {
    public static void main(String[] args) {

        Stack<String> videoGames = new Stack<>();

        videoGames.add("Super mario bros");
        videoGames.add("Smash bros ultimate");
        videoGames.add("Luigi Mansions 3");
        videoGames.add("God of war");




        System.out.println(videoGames.search("Super mario bros"));
        System.out.println("stack.pop() -> " + videoGames.pop());
        System.out.println(videoGames);
    }
}