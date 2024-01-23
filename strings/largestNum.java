public class largestNum {
    public static void main(String[] args) {
        
    }
    public static void sort(int[]arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j-1]<10 && arr[j]<10){
                    if(arr[j]>arr[j-1]){
                        //swap
                        swap(arr, j-1, j);
                    }
                    else{
                        if(arr[j]>10){

                        }
                        else if(arr[j-1]>10){

                        }
                    }
                }
            }
        }
    }
    public static void swap(int[]a,int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
