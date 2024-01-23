import java.util.Arrays;

public class cyclicSort {
    // a sorting algorithm in which the numbers are given in range from 1 to N....
    // this algorithm is useful when continuous jumbled numbers are given
    public static void main(String[] args) {
        int[] a = { 0,1,1,0,0,2,2,1 };
        cyclicSort(a);
        System.out.println(Arrays.toString(a));

        
    }

    public static void cyclicSort(int[] a) {
        // logic---> (index=number-1)
        int i = 0;
        while (i < a.length) {
            if (i != a[i]) {
                // swap it with correct position index
                int correctIndex = a[i] - 1;
                swap(a, i, correctIndex);
                // and check again
            } else {
                // else move to next element
                i++;
            }
        }
    }

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int i = 0; 
        // cyclic sorting 
        while (i < n) {
            if ((i != nums[i]) && nums[i] != n) {
                int correctIndex = nums[i];
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }
        i = 0;
        // check
        while (i < n) {
            if (i != nums[i]) {
                return i;
            } else {
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
