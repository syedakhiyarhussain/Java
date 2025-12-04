public class maxSum {
    // using kadane's algorithm
    public static int maxSubarraySum(int arr[]){
        int maximumSum=Integer.MIN_VALUE;
        int currentSum=0;
        for(int i=0; i<arr.length; i++){
            currentSum=currentSum+arr[i];
            if(currentSum<0){
                currentSum=0;
            }
            maximumSum=Math.max(currentSum, maximumSum);
        }
        return maximumSum;
    }
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Maximum Subarray Sum is: "+maxSubarraySum(arr));
    }
}
