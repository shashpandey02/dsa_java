public class stringCompression {
    public static void main(String[] args) {
        String str="aaabbceef";
        // System.out.println(compression1(a));
        // System.out.println(frequency('a', str));
        System.out.println(compression2(str));
        
    }
    public static String compression1(String str){
        StringBuilder s1=new StringBuilder();
        s1.append(str.charAt(0));
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)!=str.charAt(i-1)){
                s1.append(str.charAt(i));
            }
        }
        return s1.toString();

    }
    public static String compression2(String str){
        StringBuilder s1=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(i==0){
                s1.append(str.charAt(i));
                int count=frequency(str.charAt(i), str);
                if(count>1){
                    s1.append(count);
                }
            }
            else if(str.charAt(i)!=str.charAt(i-1)){
                s1.append(str.charAt(i));
                int count=frequency(str.charAt(i), str);
                if(count>1){
                    s1.append(count);
                }
            }
        }
        return s1.toString();
    }
    public static int frequency(char a,String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==a){
                count++;
            }
        }
        return count;
    }
}
