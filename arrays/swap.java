import java.util.Arrays;
import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
       int[] a={1,3,4,5,7};
       swap(a);
    }
    static void swap(int[] arr){
        if(arr.length%2==0){
            for(int i=0;i<arr.length;i++){
                if(i%2==0){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
                else
                    continue;
            }
            System.out.println(Arrays.toString(arr));
        }
        else{
            for(int i=0;i<arr.length-1;i++){
                 if(i%2==0){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
                else
                    continue;
            }
            System.out.println(Arrays.toString(arr));

        }

    }
}
