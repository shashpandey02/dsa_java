public class celingNumber {
    public static void main(String[] args) {
        int[] a={-6,-4,-2,1,3,4,5,7,8,9,12,14,17};
        int target=5;
        int ans=ceilingNumber(a, target);
        System.out.println(ans);
    }
    // ceiling of a number target is a number equal or smallest number greater than target
    static int ceilingNumber(int[] arr, int target){
        int s=0;
        int e=arr.length-1;
        int mid=0;
        while(s<=e){  
            mid=s+(e-s)/2;  
            if(target==arr[mid]){
                return target;
            }
            else if(target<arr[mid]){
                e=mid-1;
            }
            else if(target>arr[mid]){
                s=mid+1;
            }
        }
        // loop will break when s>e
        return arr[s];
    }
}
