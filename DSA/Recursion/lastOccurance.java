public class lastOccurance {
    public static int last(int arr[], int key, int i){
        if(i==arr.length){
            return -1;
        }
        int isFound=last(arr,key,i+1);
        if(isFound==-1 && arr[i]==key){
            return i;
        }
        return isFound;
    }
}
