package LeetCode_Medium;

public class Integer_to_Roman {
    public static void main(String[] args) {
        System.out.println(intToRoman(1000));
    }

    public static String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();

        while (num != 0) {

            if (num >= 1 && num <= 3) {
                sb.append("I");
                num -= 1;
                continue;
            }

            if (num == 4) {
                sb.append("IV");
                num -= 4;
                continue;
            }

            if (num >= 5 && num <= 8) {
                sb.append("V");
                num -= 5;
                continue;
            }

            if (num == 9) {
                sb.append("IX");
                num -= 9;
                continue;
            }

            if (num >= 10 && num < 40) {
                sb.append("X");
                num -= 10;
                continue;
            }

            if (num >= 40 && num < 50) {
                sb.append("XL");
                num -= 40;
                continue;
            }

            if (num >= 50 && num < 90) {
                sb.append("L");
                num -= 50;
                continue;
            }

            if (num >= 90 && num < 100) {
                sb.append("XC");
                num -= 90;
                continue;
            }

            if (num >= 100 && num < 400) {
                sb.append("C");
                num -= 100;
                continue;
            }

            if (num >= 400 && num < 500) {
                sb.append("CD");
                num -= 400;
                continue;
            }

            if (num >= 500 && num < 900) {
                sb.append("D");
                num -= 500;
                continue;
            }

            if (num >= 900 && num < 1000) {
                sb.append("CM");
                num -= 900;
                continue;
            }

            if (num >= 1000) {
                sb.append("M");
                num -= 1000;
            }

        }


        return sb.toString();
    }
}


//Symbol       Value
//I             1
//V             5
//X             10
//L             50
//C             100
//D             500
//M             1000

//nd