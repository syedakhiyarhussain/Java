public class CountOfSevens {
    public static int countof7(int[][] arr){
        int count=0;
        for(int[] row: arr){
            for(int i: row){
                if(i==7){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[][]={ {4,7,8},{8,8,7} };
        System.out.println(countof7(arr));
    }
}
