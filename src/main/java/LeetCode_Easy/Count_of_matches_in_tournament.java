package LeetCode_Easy;

public class Count_of_matches_in_tournament {
    public static void main(String[] args) {

        System.out.println(numberOfMatches(14));

    }

    public static int numberOfMatches(int teams) {


        int matches = 0;

        while (teams > 1) {
            if (teams % 2 == 0) {
                teams = teams / 2;
                matches += teams;  // 6 -> 3
            } else {
                teams = ((teams - 1) / 2);
                matches += teams;
                teams++;
            }
        }

        return matches;
    }
}
