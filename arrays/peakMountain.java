public class peakMountain {
    public static void main(String[] args) {
        int[] a={1,2,3,4,7,5,2};
        int ans=peakElement(a);
        System.out.println(ans);
        
    }
    static int peakElement(int[] arr){
        int s=0;
        int e=arr.length-1;
        // finding index of peak element 
        while(s<e){
            int mid=s+(e-s)/2;
            if(arr[mid]<arr[mid+1]){
                // ascending side
                s=mid+1;
            }
            else if(arr[mid]>arr[mid+1]){
                // descending side
                e=mid;
            }
            // loop will end when s==e which is the index of peak element
        }
        return s;
    }
    
}
