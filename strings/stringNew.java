public class stringNew {
    public static void main(String[] args) {
        // String a="Hello";
        // String b="Hello";
        // both are pointing to same memory in heap(pool)
        // to check use == 
        // System.out.println(a==b);
        // String a="Hello";
        // String b=new String("Hello");
        // System.out.println(a==b);
        // here b is another object of same value
        int[]a={1,4,5,8};
        StringBuilder text=new StringBuilder();
        for(int i=0;i<a.length;i++){
            text.append(a[i]);
        }
        System.out.println(text);

    }
}
