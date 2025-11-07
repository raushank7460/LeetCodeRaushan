package leetCode;

import java.util.Arrays;

public class productOf_array_except_self {
    public static void main(String[] args) {
        int[]nums={1,2,3,4};
        System.out.println(Arrays.toString(results(nums)));

    }
    public static int[]results(int[]nums){
        int len=nums.length;
        int[]result=new int[len];
        result[0]=1;
        for(int i=1;i<len;i++){
            result[i]=result[i-1]*nums[i-1];
        }
        int right=1;
        for(int i=len-1;i>=0;i--){
            result[i]*=right;
            right*=nums[i];
        }
        return result;
    }
    
}
