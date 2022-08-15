class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        int sum = 0;
        for (int number : numbers) {
            sum +=number;
        }

        answer = 45 - sum;
        return answer;
    }
}