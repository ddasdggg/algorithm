import java.util.Scanner;

public class Main {
    public int solution(String s, char c) {
        int answer = 0;

        s = s.toUpperCase();
        c = Character.toUpperCase(c);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner keyboard = new Scanner(System.in);

        String s = keyboard.next();
        char c = keyboard.next().charAt(0);

        System.out.println(main.solution(s, c));
    }
}