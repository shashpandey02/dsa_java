public class setIntegers {
    public static void main(String[] args) {
        int[] a = { 2, 2 };
        System.out.println(misMatch(a).toString());
    }

    public static int[] misMatch(int[] nums) {
        int[] ans = new int[2];
        int n = nums.length;
        int i = 0;
        while (i < n) {
            if (i != nums[i] - 1) {
                int correctIndex = nums[i] - 1;
                if (nums[i] == nums[correctIndex]) {
                    // duplicacy
                    // to array
                    i++;
                } else {
                   swap(nums, i, correctIndex);
                }
            } else {
                i++;
            }
        }
        for(int j=0;j<n;j++){
            if(j!=nums[j]-1){
                ans[0]=nums[j];
                ans[1]=nums[j]-1;
            }
        }
        return ans;
    }
    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
