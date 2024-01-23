import java.util.ArrayList;

public class largestNum {
    public static void main(String[] args){
        ArrayList<Integer>digits=new ArrayList<>();
//        int[] nums={3,30,34,5,9};
//        for(int i=0;i<nums.length;i++){
//            if(nums[i]%10!=nums[i]){
//                // breaking the digits
//
//            }
//            else{
//                // adding single digits
//                digits.add(nums[i]);
//            }
//        }
        breakDigit(digits,341);
        System.out.println(digits.toString());

    }
    public static void breakDigit(ArrayList list,int n){
        while(n>0){
            //taking digits one by one
            int d=n%10;
            // adding single digits to list
            list.add(d);
            n=n/10;
        }
    }

}
