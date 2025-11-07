public class rotateArray {
    public static void main(String[] args) {
        int[]nums={1,2,3,4,5,6,7};
        int len=nums.length;
        int k=3;
        k=k%len;
        reverse(nums, 0, len-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, len-1);

        for(int ele:nums){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void reverse(int[]nums,int st,int end){
        while(st<end){
            int temp=nums[st];
            nums[st]=nums[end];
            nums[end]=temp;
            st++;
            end--;

        }
    }
    
}
