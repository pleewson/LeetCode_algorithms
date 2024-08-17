package LeetCode_Daily.september2024;

public class Maximum_Number_of_Points_with_Cost {
    public static void main(String[] args) {
        int[][] points = {
                {1, 5},
                {2, 3},
                {4,2}
        };

        System.out.println(maxPoints(points));
    }

    public static long maxPoints(int[][] points) {

        int diff = 0;
        int position = Integer.MIN_VALUE;
        int previousPosition = Integer.MIN_VALUE;
        int sum = 0;

        boolean startCheckingDifference = false;

        for (int i = 0; i < points.length; i++) {
            int biggestNum = Integer.MIN_VALUE;
            for (int j = 0; j < points[i].length; j++) {
                if (points[i][j] > biggestNum) {
                    biggestNum = points[i][j];
                    position = j;
                }
            }
            sum += points[i][position];

            System.out.println("POSITION : " + position);
            if (previousPosition != Integer.MIN_VALUE) {

                if(previousPosition >= position){
                    diff += (position - previousPosition);
                }else {
                    diff += (previousPosition - position);
                }
                System.out.println("DIFFERENCE : " + diff);
            }

            previousPosition = position;

        }


        return sum + diff;
    }

}
