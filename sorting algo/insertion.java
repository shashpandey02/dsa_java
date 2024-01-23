import java.util.Arrays;

public class insertion {
   public static void main(String[] args) {
        int[] a={2,3,1,3,4,-1,-3,-4};
        insertionSort(a);
        System.out.println(Arrays.toString(a));
    
   }
   static void insertionSort(int []a){
        for(int i=0;i<=a.length-2;i++){
            for(int j=i+1;j>=1;j--){
                if(a[j]<a[j-1]){
                    // swap
                    int temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
            }
        }
    }
}

