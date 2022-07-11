import java.util.Scanner;

public class Palindrome {
    public String solution(String str) {
        String answer = "NO";

        str = str.toUpperCase();
        String reverseStr = new StringBuilder(str).reverse().toString();
        if (str.equals(reverseStr)) {
            answer = "YES";
        }

        return answer;
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();

        Scanner keyboard = new Scanner(System.in);
        String str = keyboard.next();
        System.out.println(palindrome.solution(str));
    }
}