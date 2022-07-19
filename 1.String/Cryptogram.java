import java.util.*;

public class Cryptogram {
    public String solution(int n, String str) {
        String answer = "";

        for (int i = 0; i < n; i++) {
            String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(tmp, 2);
            answer += (char) num;
            str = str.substring(7);
        }

        return answer;
    }

    public static void main(String[] args) {
        Cryptogram cryptogram = new Cryptogram();

        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        String str = keyboard.next();
        System.out.println(cryptogram.solution(n, str));
    }
}