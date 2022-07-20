import java.util.*;

public class LargeNumber {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                answer.add(arr[i]);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        LargeNumber ln = new LargeNumber();

        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = keyboard.nextInt();
        }

        for (int x : ln.solution(arr)) {
            System.out.print(x + " ");
        }
    }
}