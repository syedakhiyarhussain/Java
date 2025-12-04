public class firstOccurance {
    public static int first(int arr[], int key, int i){
        if(i==arr.length-1 && arr[i]!=key){
            return -1; 
        }
        if(arr[i]==key){
            return i;
        }else{
            return first(arr,key,i+1);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,2,5,6};
        System.out.println(first(arr,2,0));
    }
}
