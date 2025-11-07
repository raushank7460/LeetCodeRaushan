public class maximumProductSubarray {
    public static void main(String[] args) {
        int[]nums={2,3,-2,4};
        System.out.println(maxProductSubArray(nums));
    }
    public static int maxProductSubArray(int[]nums){
        int maxProd=nums[0];
        int minProd=nums[0];
        int result = nums[0];

        for(int i=1;i<nums.length;i++){
            int temp = maxProd;

            if(nums[i]<0){
                int t = maxProd;
                maxProd = minProd;
                minProd = t;
            }

            maxProd = Math.max(nums[i],maxProd*nums[i]);
            minProd = Math.min(nums[i], minProd*nums[i]);

            result = Math.max(result,maxProd);
        }
       return result;

    }

    
}
