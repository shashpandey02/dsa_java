import java.util.HashMap;
public class HashMaptut {
    public static void main(String[] args) {
        int k=2;
        int[]ans=new int[k]; 
        // HashMap is a type of data structure which store data in form pairs of keys and their values
        HashMap<Integer,String> data= new HashMap<Integer,String>();
        // <Key,value> need to give data type for key and values while declaring hashmaps
        // insertion 
        // data.put(73,"Akash");
        // data.put(74,"Varun");
        // data.put(75,"Shashwat");
        HashMap<Integer,Integer> list=new HashMap<>();
        list.put(1,3);
        list.put(2,2);
        list.put(3,1);

        System.out.println(list.toString());
    }

    
}
