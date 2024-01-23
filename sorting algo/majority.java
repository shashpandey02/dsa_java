import java.util.ArrayList;

public class majority {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        

        
    }
    public static int apperance(int[]nums,int a){
        int target=a;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                count++;
            }
        }
        return count;
    }
    public static int getMax(ArrayList list){
        int max=list.get(0);
        for(int i=0;i<list.size();i++){
            if(max < list.get(i)){
                max=list.get(i);
            }
        }
        return max;
    }
}
