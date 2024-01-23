import java.util.Arrays;

public class q {
    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,10};
        int[] ans={-1,-1};
        int target=8;
        int s=0;
        int e=nums.length-1;
        
        // finding first occurance of target
        while(s<=e){
            int mid=s+(e-s)/2;
            if(target==nums[mid]){
                ans[0]=mid;
                e=mid-1;
            }
            else if(target<nums[mid]){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        s=0;
        e=nums.length-1;
        // finding last occurance of target
        while(s<=e){
            int mid=s+(e-s)/2;
            if(target==nums[mid]){
                ans[1]=mid;
                s=mid+1;
            }
            else if(target<nums[mid]){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        System.out.println(Arrays.toString(ans));
   
    }
}
   

