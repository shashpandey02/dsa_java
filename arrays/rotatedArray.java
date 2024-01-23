public class rotatedArray {
    public static void main(String[] args) {
            int[] a={5,1,3};
            int target=1;
            int ans=index(a, target);
            System.out.println(ans);
    }
    static int index(int[] nums,int target){
        int s=0;
        int e=nums.length-1;
        int p=0;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(mid < e && nums[mid] > nums[mid+1]){
                p=mid;
                
            }
            else if(mid > s && nums[mid]< nums[mid-1]){
                p=mid-1;
                
            }
            else if(nums[s]>=nums[mid]){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        
        System.out.println(p);
        s=0;
        e=p;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(target==nums[mid]){
                return mid;
            }
            else if(target<nums[mid]){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
            // Binery search in first half  
        }
        s=p+1;
        e=nums.length-1;
         while(s<=e){
            int mid=s+(e-s)/2;
            if(target==nums[mid]){
                return mid;
            }
            else if(target<nums[mid]){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
            // Binery search in second half  
        }
        return -1;   
    }
    
}
