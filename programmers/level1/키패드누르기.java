import java.util.*;

class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        List<Integer> left = Arrays.asList(1, 4, 7);
        List<Integer> right = Arrays.asList(3, 6, 9);

        Integer left_hand = 10;
        Integer right_hand = 12;
        for (int number : numbers) {
            if (number == 0) {
                number = 11;
            }
            if (left.contains(number)) {
                answer += "L";
                left_hand = number;
            } else if (right.contains(number)) {
                answer += "R";
                right_hand = number;
            } else {
                int left_distance = Math.abs((number - left_hand) / 3) + Math.abs((number - left_hand) % 3);
                int right_distance = Math.abs((number - right_hand) / 3) + Math.abs((number - right_hand) % 3);

                if (left_distance < right_distance) {
                    answer += "L";
                    left_hand = number;
                } else if (right_distance < left_distance) {
                    answer += "R";
                    right_hand = number;
                } else {
                    if (hand.equals("left")) {
                        answer += "L";
                        left_hand = number;
                    } else {
                        answer += "R";
                        right_hand = number;
                    }
                }
            }
        }

        return answer;
    }
}