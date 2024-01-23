import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class frequency {
    public static void main(String[] args) {
        // HashMap<Integer,Integer>list=new HashMap<>();
        int k = 2;
        int[] nums = { 1, 1, 1, 1, 2, 3, 3, 4 };
        int[] ans = new int[k];
        int feq = 0;
        int index = -1;
        while (k > 0) {
            // System.out.println(index);
            for (int i = 0; i < nums.length; i++) {
                if (i == index) {
                    continue;
                }
                if (i == 0) {
                    int count = frequency(nums, nums[i]);
                    if (count > feq) {
                        feq = count;
                        index = i;
                    }
                } else {
                    if (nums[i] == nums[i - 1]) {
                        continue;
                    } else {
                        int count = frequency(nums, nums[i]);
                        if (count > feq) {
                            feq = count;
                            index = i;
                        }
                    }
                }
            }
            feq = 0;
            // adding the max frequency to array
            ans[k - 1] = nums[index];
            k--;
        }
        System.out.println(Arrays.toString(ans));
        // System.out.println(list.toString());
        // while(k>0){
        // int max=1;
        // for(int val:list.values()){
        // if(val>max){
        // max=val;
        // }
        // }
        // for(int element:list.keySet()){
        // if()
        // }
        // }
        // System.out.println(Arrays.toString(ans));

    }

    public static int frequency(int[] a, int n) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {
                count++;
            }
        }
        return count;
    }
}
