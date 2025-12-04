public class bubbleSort {
    public static void sort(int arr[]){
        int n=arr.length;
        for(int turn=0; turn<n-1; turn++){
            int swaps=0;
            for(int i=0; i<n-turn-1; i++){
                if(arr[i]<arr[i+1]){
                    int t=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=t;
                    swaps++;
                }
            }
            if(swaps==0){
                System.out.println("Already sorted array");
                break;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        sort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}
