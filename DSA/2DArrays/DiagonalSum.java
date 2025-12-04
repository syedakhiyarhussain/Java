public class DiagonalSum {
    public static int diagonal(int arr[][]){
        int sum=0;
        int n=arr.length;
        for(int i=0; i<n; i++){
                sum+=arr[i][n-i-1];
                sum+=arr[i][i];
            }
            if(n%2==1){
                sum-=arr[n/2][n/2];
            }
        return sum;
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(diagonal(arr)); 
    }
}
