import java.util.ArrayList;
import java.util.List;

public class allDuplicates {
    public static void main(String[] args) {
        int[] a={4,3,2,7,8,2,3,1};
        System.out.println(allDuplicates(a).toString());


    }
    public static List<Integer> allDuplicates(int []nums){
        ArrayList<Integer>list=new ArrayList<>();
        int n=nums.length;
        int i=0;
        while(i<n){
            if(i!=nums[i]-1){
                int correctIndex=nums[i]-1;
                if(nums[i]==nums[correctIndex]){
                    //duplicate number ignore
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
                list.add(nums[j]);
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
