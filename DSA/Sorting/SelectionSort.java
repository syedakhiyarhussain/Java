public class SelectionSort {
    public static void Selection(int arr[]){
        int n=arr.length;
        for(int i=0; i<n-1; i++){
            int position=i;
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[position]){
                    position=j;
                }
            }
            int temp=arr[position];
            arr[position]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        Selection(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
