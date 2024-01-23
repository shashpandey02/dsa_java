import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        int[] arr={170,-368,148,672,397,-629,-788,192,170,309,-615,-237};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void bubbleSort(int[] a){
        // run the steps n-1 time
        boolean swap;
        for(int i=0;i<a.length;i++){
            swap=false;
            // checking each element step by step
            for(int j=1;j<a.length-i;j++){
                // swap if previous element is greater
                if(a[j]<a[j-1]){
                    int temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                    swap=true;
                }
            }
            // of j never swaps for a value then array is already sorted break the loop no need to check again 
            if(swap==false){
                break;
            }
        }

    }
}
