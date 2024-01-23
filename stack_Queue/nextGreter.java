import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class nextGreter {
    public static void main(String[] args) {
        int[] nums = { 2, 5, 9, 3, 1, 12, 6, 8, 7 };
        int[] ans = new int[nums.length];
        Stack<Integer> s = new Stack<>();
        s.push(nums[nums.length - 1]);
        ans[nums.length - 1] = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            while (s.size() > 0 && nums[i] > s.peek()) {
                s.pop();
            }
            if (s.size() == 0) {
                ans[i] = -1;
            } else {
                ans[i] = s.peek();
            }
            s.push(nums[i]);
        }
        System.out.println(Arrays.toString(ans));

    }
}
