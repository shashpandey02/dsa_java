public class SplitArray {
    public static void main(String[] args) {
        
    }


    public int splitArray(int[] nums, int k) {
        int s=0;
        int e=0;
        for(int i=0;i<nums.length;i++){
            s=Math.max(s,nums[i]); // take maximum of two numbers
            e+=nums[i]; // max ans will be total sum of array 
        }
        // binery search
        while(s<e){
            int mid=s+(e-s)/2;
            // calculate how many pieces you can divide the array
            int sum=0;
            int piece=1;
            for(int element:nums){
                if(sum+element>mid){
                    // you cannot add this ...add to another sub array
                    sum=element;
                    piece++;
                }
                else{
                    sum+=element;
                }

            }
            if(piece>k){
                s=mid+1;
            }
            else{
                e=mid;
            }

        }
        // when s==e
        return e;
        
    }
    
}
