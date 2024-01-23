import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String s="anagram";
        String t="nagaram";
        char[] a1=s.toCharArray();
        char[] a2=t.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        StringBuilder str2=new StringBuilder();
        StringBuilder str1=new StringBuilder();
        for(int i=0;i<a1.length;i++){
            str1.append(a1[i]);
        }
        for(int i=0;i<a2.length;i++){
            str2.append(a2[i]);
        }
        
        if(str1.toString().equals(str2.toString())){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

    }
}
