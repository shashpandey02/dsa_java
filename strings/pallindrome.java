import java.util.Scanner;

public class pallindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String=");
        String str=sc.nextLine();
        System.out.println(checkpallindrome(str));
        
    }
    public static boolean checkPallindrome(String a){
        // converting string to an array
        char[] arr=a.toCharArray();
        int n=arr.length;
        // reversing the array
        for(int i=0;i<n/2;i++){
            //swap
            char temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        StringBuilder str=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            str.append(arr[i]);
        }
        str.reverse();
        
        // System.out.println(str);
        if(a.equals(str.toString())){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean checkpallindrome(String s){
       int start=0;
       int end=s.length()-1;
       while(start<end){
        if(s.charAt(end)!=s.charAt(start)){
            return false;
        }
        else{
            start++;
            end--;
        }
       }
       return true; 
    }
}
