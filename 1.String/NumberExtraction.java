import java.util.Scanner;

public class NumberExtraction {
    public int solution(String str) {
        int answer;
        str = str.toUpperCase().replaceAll("[^0-9]", "");
        answer = Integer.parseInt(str);
        return answer;
    }

    public static void main(String[] args) {
        NumberExtraction ne = new NumberExtraction();

        Scanner keyboard = new Scanner(System.in);
        String str = keyboard.next();
        System.out.println(ne.solution(str));
    }
}