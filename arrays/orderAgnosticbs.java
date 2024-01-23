public class orderAgnosticbs {
    public static void main(String[] args) {
        int[] a={32,27,24,22,19,15,14,11,9,6,3,2,0,-1,-3,-5};
        int target=11;
        int ans=orderAgnosticbs(a,target);
        System.out.println(ans);
        
    }
    static int orderAgnosticbs(int[] arr,int target){
        // when order of sorted array is unknown i.e ascending or descending
        int s=0;
        int end=arr.length-1;
        boolean isASC=arr[s]<arr[end];
        while(s<=end){
            int mid=s+(end-s)/2;
            if(target==arr[mid]){
                // ans found 
                return mid;
            }    
            if(isASC){
                if(target<arr[mid]){
                    end=mid-1;
                }
                else{
                    s=mid+1;
                }
            }
            else{
                if(target>arr[mid]){
                    end=mid-1;
                }
                else{
                    s=mid+1;
                }

            }
        }
        return -1;
    }
}
