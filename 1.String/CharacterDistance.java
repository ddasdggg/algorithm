import java.util.Scanner;

public class CharacterDistance {
    public int[] solution(String str, char c) {
        int[] answer = new int[str.length()];
        int p = 1000;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;
            }

        }
        p = 1000;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == c) {
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        CharacterDistance cd = new CharacterDistance();

        Scanner keyboard = new Scanner(System.in);
        String str = keyboard.next();
        char c = keyboard.next().charAt(0);
        for (int x : cd.solution(str, c)) {
            System.out.print(x + " ");
        }
    }
}