import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> numbers = new HashSet<>();

        for (int num : nums) {
            numbers.add(num);
        }

        int choiseCnt = nums.length / 2;
        if (choiseCnt < numbers.size()) {
            answer = choiseCnt;
        } else {
            answer = numbers.size();
        }

        return answer;
    }
}