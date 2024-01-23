import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class missingNumbers {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        int[] a={4,3,2,7,8,2,3,1}; 
        findDisappearedNumbers(a);
        System.out.println(Arrays.toString(a));       
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int n=nums.length;
        int i=0;
        // integers are in the range from [1,n]
        while(i<n){
            if(i!=nums[i]-1){
                int correctIndex=nums[i]-1;
                if(nums[i]==nums[correctIndex]){
                    // ignore the duplicates
                    i++;
                }
                else{
                    swap(nums, i, correctIndex);
                }
            }
            else{
                i++;
            }
        }
        for(int j=0;j<n;j++){
            if(j!=nums[j]-1){
                list.add(j+1);
            }
        }
        return list;

    }
    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
