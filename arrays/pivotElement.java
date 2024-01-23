public class pivotElement {
    public static void main(String[] args) {
        int[] a={2,9,2,2,2,2};
        int p=Findpivot(a);
        System.out.println(p);
    }
    static int Findpivot(int[] nums){
        // 4 cases
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(mid < e && nums[mid] > nums[mid+1]){
                return mid;
            }
            else if(mid > s && nums[mid]< nums[mid-1]){
                return mid-1;
            }
            else if(nums[s]>= nums[mid]){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return -1;

    }
    // find the pivot if the elements in the array are duplicate
    static int duplicatepivot(int[] nums){
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(mid < e && nums[mid] > nums[mid+1]){
                return mid;
            }
            else if(mid > s && nums[mid]< nums[mid-1]){
                return mid-1;
            }
            // for duplicate elements
            if(nums[s]==nums[mid]&&nums[mid]==nums[e]){
                // check whether the start = mid = end 
                // ignore the duplicate elements
                // check if start and end are the pivot or not
                if(nums[s]>nums[s+1]){
                    return s;
                }
                s++;
                if(nums[e]<nums[e-1]){
                    return e-1;
                }
                e--;
            }
            // left side is sorted then pivot will be at right
            else if(nums[s]<nums[mid] || (nums[s]==nums[mid] && nums[mid]>nums[e])){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return -1;
    }
    static int bs(int[] nums,int target, int s,int e){
        while(s<=e){
            int mid=s+(e-s)/2;
            if(target==nums[mid]){
                return mid;
            }
            else if(target < nums[mid]){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return -1;
    }
    
}
