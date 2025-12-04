public class changeArray {
    public static void change(int arr[], int i, int val){
        // base case
        if(arr.length==i){
            printArr(arr);
            return;
        }
        // kaam
        arr[i]=val;
        change(arr, i+1, val+1);//-> function call
        arr[i]=arr[i]-2;//-> backtracking step
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]=new int[5];
        change(arr, 0, 1);
        printArr(arr);
    }
}
