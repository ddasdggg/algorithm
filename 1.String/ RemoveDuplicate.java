import java.util.Scanner;

public class RemoveDuplicate {
    public String solution(String str) {
        String answer = "";
        char[] cr = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (answer.indexOf(cr[i]) == -1) {
                answer += cr[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        RemoveDuplicate rd = new RemoveDuplicate();

        Scanner keyboard = new Scanner(System.in);
        String str = keyboard.next();
        System.out.println(rd.solution(str));
    }
}