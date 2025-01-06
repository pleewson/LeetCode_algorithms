package LeetCode_Daily.year2025.january2025;

import java.util.ArrayList;
import java.util.List;

public class Unique_Length3_Palindromic_Subsequences {
    public static void main(String[] args) {
//        String s = "aabca";
        String s = "nzhosdwmwomlebymvkbqbdohzdtpufnllwzhqptyffreebalphgsslryuqryloqxvbehtohdrsynmcbligczvoyzrhbtmqxepqmcjirwishyvoliizknzrokejtqtfoylsdzpgeooczxldvmsnhvzgojxnwwhukynvhhpzmdoiooliesogubtsvkrvzmanpwwlnlskremzisqwwwjistwabqxztlcqwlsxbuhjdnouecwqgxdlggauxrelipqlgvfkmgoozhzrhortbpmxhupjqqrsrvqxqilptchtedoznxvgvmuticzdzwszzujuanlrrpvycgawoxfbvxhkdyhmcxdlrtyktekcmkyajlywcrozjkedwlrqpaugdobtffwidxawddgeraaugiebtntmuncnybuwnlzbmkrmxbcpbhqoiznlpcswqtsflfilkclrjdxbvcctvopoidjrtwszpjpfrfcvjtouvzvpqayvgesiiawokdqatfkijsuocbeqrhrmlhtclhrmrbkpahfdgiatejsnvubwbaxwooskcaiuqvxcvgpnkiiiencnxjsvvgdfptreumttlyoqqwqdblhhbnilbvbwwpnmouxlvqimdbcxisnegllnejhkipuqbcrhsrxwipdjzskpyijuvrvtrnqljjefymfdcvcuvwaitdjevuvelkrglhtlnivmvjyzmhjnzvudgqwocvwhthxdlyfljabngzjayvqudhvsdslacgvosnchhbkulcxpangdlpgkrczbnnzokmqzgauitqutiboveumsqvbulhbfbynzogtejuwi";
        System.out.println(countPalindromicSubsequence(s));
    }


    public static int countPalindromicSubsequence(String s) {
        List<String> palindroms = new ArrayList<>();
        char[] sChar = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length() - 1; j > i; j--) {
                if (sChar[i] == sChar[j]) {
                    for (int x = i+1; x < j ; x++) {
                        String str = "" + sChar[i] + sChar[x] + sChar[j];
                        if(!palindroms.contains(str)){
                            palindroms.add(str);
                        }
                    }
//                    System.out.println("i = " + sChar[i] + " j = " + sChar[j]);
                }
            }
        }

        return palindroms.size();
    }
}
