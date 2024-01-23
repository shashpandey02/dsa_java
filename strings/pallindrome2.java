public class pallindrome2 {
    public static void main(String[] args) {
      String a="abccbc";
      for(int i=0;i<a.length();i++){
        for(int j=i+1;j<=a.length();j++){
            if(pallindrome(a.substring(i, j))){
                System.out.println(a.substring(i, j));
            }
        }
      }
    }
    public static boolean pallindrome(String str){
        int s=0;
        int e=str.length()-1;
        while(s<e){
            if(str.charAt(s)==str.charAt(e)){
                s++;
                e--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
