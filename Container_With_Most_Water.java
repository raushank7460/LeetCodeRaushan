public class Container_With_Most_Water {

    public static void main(String[] args) {
        int[]height={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));

    }
    public static int maxArea(int[]height){
        int left=0;
        int right=height.length-1;
        int maxAreas=0;
        while(left<right){
            int width =  right-left;
            int minHeight = Math.min(height[left],height[right]); 

            int Area = width * minHeight;

            maxAreas = Math.max(maxAreas,Area);

            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }


        }
        return maxAreas;
    }

    
}
