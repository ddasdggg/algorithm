import java.util.Scanner;

public class LongestWord {
    public String solution(String ks) {
        String answer = "";

        int m = Integer.MIN_VALUE;
        String[] sa =  ks.split(" ");
        for (String str : sa) {
            if (str.length() > m) {
                m = str.length();
                answer = str;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        LongestWord longestWord = new LongestWord();

        Scanner keyboard = new Scanner(System.in);
        String ks = keyboard.nextLine();
        System.out.println(longestWord.solution(ks));
    }
}