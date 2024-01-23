import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        int[] a={1,2,3,4};
        selectSort(a);
        System.out.println(Arrays.toString(a));
    }
    static void selectSort(int[] arr){
        // runing the loop for n-1 times
        for(int i=0;i<arr.length;i++){
            // taking the last index
            int start=i;
            
            // find the max element index in the range (0,last)
            int max= getMax(arr,start,(arr.length-1));
            // swap the max element with its right position i.e last
            swap(arr,max,start);
        }
    }
    static void swap(int[] arr,int max,int last){
        int temp=arr[max];
        arr[max]=arr[last];
        arr[last]=temp;
    }
    static int getMax(int[] arr,int start,int end){
        // will return the max index of element
        int max=arr[start];
        int index=0;
        for(int i=start;i<=end;i++){
            if(max<arr[i]){
                // new max element index
                max=arr[i];
                index=i;
            }
        }
        //System.out.println(max);
        return index;
    }
    
}
