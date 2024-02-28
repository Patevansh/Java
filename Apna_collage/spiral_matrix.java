
class spiral_matrix{
    public static void main(String...args){
        int arr[][]={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
        spiral_matrix s = new spiral_matrix();
        s.spiral(arr);
    }
    public void spiral(int mat[][]){
        int er=mat.length-1;
        int ec=mat[0].length-1;
        int sr=0,sc=0;
        while(sr<=er && sc<=ec){
            for(int i=sc;i<=ec;i++){
                System.out.print(mat[sr][i]+" ");
            }
            for(int j=sr+1;j<=er;j++){
                System.out.print(mat[j][ec]+" ");
            }
            for(int k=ec-1;k>=sr;k--){
                System.out.print(mat[er][k]+" ");
            }
            for(int l=er-1;l>sr;l--){
                System.out.print(mat[l][sc]+" ");
            }
            er--;
            ec--;
            sc++;
            sr++;
        }
    }
}