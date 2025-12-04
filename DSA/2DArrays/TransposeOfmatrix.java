public class TransposeOfmatrix {
    public static int[][] Transpose(int arr[][]){
        int rows=arr.length, col=arr[0].length;
        int trans[][]=new int[col][rows];
        for(int i=0; i<rows; i++){
            for(int j=0; j<col; j++){
                trans[j][i]=arr[i][j];
            }
        }
        return trans;
    }
    public static void main(String[] args) {
        int arr[][]={ {4,7,8},{8,8,7} };
        int trans[][]=Transpose(arr);
        for(int rows[]:trans){
            for(int i:rows){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
