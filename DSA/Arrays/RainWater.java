public class RainWater {
    public static int TrappedRainWater(int height[]){
        int n=height.length;
        //Calculate left max boundary array
        int LeftMaxBoundary[]=new int[n];
        LeftMaxBoundary[0]=height[0];
        for(int i=1; i<n; i++){
            LeftMaxBoundary[i]=Math.max(height[i], LeftMaxBoundary[i-1]);
        }
        //Calculate right max boundary array
        int RightMaxBoundary[]=new int[n];
        RightMaxBoundary[n-1]=height[n-1];
        for(int i=n-2; i>=0; i--){
            RightMaxBoundary[i]=Math.max(height[i], RightMaxBoundary[i+1]);
        }
        //Caculate trapped water
        int TrappedWater=0;
        for(int i=0; i<n; i++){
            // water_level - height
            int water=Math.min(RightMaxBoundary[i], LeftMaxBoundary[i])-height[i];
            TrappedWater+=water;
        }
        return TrappedWater;
    }
    public static void main(String[] args) {
        int height[]={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(TrappedRainWater(height));
    }
}
