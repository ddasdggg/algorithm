import java.util.Scanner;

public class CaseConversion {
    public String solution(String s) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                answer += Character.toLowerCase(s.charAt(i));
            } else {
                answer += Character.toUpperCase(s.charAt(i));
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main main = new CaseConversion();

        Scanner keyboard = new Scanner(System.in);

        String s = keyboard.next();
        System.out.println(main.solution(s));
    }
}