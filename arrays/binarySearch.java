
public class binarySearch {
    public static void main(String[] args) {
        int[] a={-12,-8,-2,1,3,4,5,6,11,14,21,25,28,31,42};  //assuming array to sorted in ascending order
        int target=55;
        int ans=binarySearch(a, target);
        System.out.println("Index of target element="+ans);
    }
      // returning the index of target element
    static int binarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            // find the mid element 
            // int mid=(start+end)/2;
            int mid= start+(end-start)/2; // better way to find mid as the it will not exceed integer range limit
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                // ans found
                return mid;
            }
        }
        // if target is not found
        return -1;
    }
    
}

