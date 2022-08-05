import java.util.*;

public class TwoNumberSum {
    public int[] solution(int[] nums, int target) {
        int [] result = new int[2];
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] + nums[i + 1] == target) {
                result[0] = i;
                result[1] = i + 1;
            }
        }
        return result;
    }
}