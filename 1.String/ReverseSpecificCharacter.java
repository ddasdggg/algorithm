import java.util.Scanner;

public class ReverseSpecificCharacter {
    public String solution(String sa) {
        String answer;

        char[] cr = sa.toCharArray();
        int li = 0;
        int ri = cr.length -1;
        while (li < ri) {
            if (!Character.isAlphabetic(cr[li])) li ++;
            else if (!Character.isAlphabetic(cr[ri])) ri --;
            else {
                char tmp = cr[li];
                cr[li] = cr[ri];
                cr[ri] = tmp;
                li += 1;
                ri -= 1;
            }

        }
        answer = String.valueOf(cr);
        return answer;
    }

    public static void main(String[] args) {
        ReverseSpecificCharacter rsc = new ReverseSpecificCharacter();

        Scanner keyboard = new Scanner(System.in);
        String str = keyboard.next();
        System.out.println(rsc.solution(str));
    }
}