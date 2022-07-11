import java.util.ArrayList;
import java.util.Scanner;

public class ReverseWord {
    public ArrayList<String> solution(String[] sa) {
        ArrayList<String> answer = new ArrayList<>();

        for (String str : sa) {
            String tmp = new StringBuilder(str).reverse().toString();
            answer.add(tmp);
        }

        return answer;
    }

    public static void main(String[] args) {
        ReverseWord reverseWord = new ReverseWord();

        Scanner keyboard = new Scanner(System.in);

        int n = keyboard.nextInt();
        String [] sa = new String[n];
        for (int i = 0; i < n ; i ++) {
            sa[i] = keyboard.next();
        }

        for (String str : reverseWord.solution(sa)) {
            System.out.println(str);
        }
    }
}