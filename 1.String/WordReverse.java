import java.util.ArrayList;
import java.util.Scanner;

public class WordReverse {
    public ArrayList<String> solution(String[] sa) {
        ArrayList<String> answer = new ArrayList<>();

        for (String str : sa) {
            String tmp = new StringBuilder(str).reverse().toString();
            answer.add(tmp);
        }

        return answer;
    }

    public static void main(String[] args) {
        WordReverse wordReverse = new WordReverse();

        Scanner keyboard = new Scanner(System.in);

        int n = keyboard.nextInt();
        String [] sa = new String[n];
        for (int i = 0; i < n ; i ++) {
            sa[i] = keyboard.next();
        }

        for (String str : wordReverse.solution(sa)) {
            System.out.println(str);
        }
    }
}