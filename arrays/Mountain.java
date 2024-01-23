public class Mountain {
    public static void main(String[] args) {
        int[] a={0,1,2,3,4,2,1}; // this is a mountain array 
        int target=3;             // return the minimun index of target in mountain array
        int ans=mountainElement(a, target);
        System.out.println(ans);    
        
    }
    static int mountainElement(int[]arr,int target){
        int ans=-1;
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
        int p=s;// index of peak element
        // check in ascending side 
        s=0;
        e=p;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(target==arr[mid]){
                ans=mid;
                return ans;
            }
            else if(target<arr[mid]){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        // check in descending side 
        s=p;
        e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(target==arr[mid]){
                ans=mid;
                return ans;
            }
            else if(target>arr[mid]){
                e=mid-1;
            }
            else{
                s=mid+1;
            }

        }
        return ans;   
    }


}

