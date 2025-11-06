package leetCode;
import java.util.HashSet;

public class duplicate_Ele {
    public static void main(String[] args) {
        
        int[]num={1,2,3,1};
        System.out.println(isDuplicate(num));

    }
    public static boolean isDuplicate(int[]num){
       HashSet<Integer>set=new HashSet<>();
        for(int ele:num){
            if(set.contains(ele)){
                return true;
            }
            set.add(ele);
        }
        return false;
    }


    
}
