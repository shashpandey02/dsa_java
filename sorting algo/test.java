import java.util.ArrayList;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[]num={1,2,3};
        String a=""+num[0]; 
       for(int i=1;i<num.length;i++){
            a=a+num[i];
       }
       
       System.out.println(a);
        
    }
    public static void selecSort(int[]a){
        for(int i=0;i<a.length;i++){
            int start=i;
            int end=a.length-1;
            int max=getmax(a,start,end);
            swap(a,max,start);
        }
    }
    static void swap(int[] arr,int max,int start){
        int temp=arr[max];
        arr[max]=arr[start];
        arr[start]=temp;
    }
    public static int getmax(int[]a,int start,int end){
        // returning the maximum element
        int max=a[start];
        int Index=0;
        for(int i=start;i<=end;i++){
            if(a[i]>max){
                max=a[i];
                Index=i;
            }
        }
        return Index;
    }
}

