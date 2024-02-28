class diagonal{
    public static void main(String...args){
        int arr[][]={{1,2,3,4},{6,7,8,9},{11,12,13,14},{16,17,18,19}};
        diagonal d=new diagonal();
        d.diagonalsum(arr);
    }
    void diagonalsum(int mat[][]){
        int n=mat.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+mat[i][i];
            sum = sum+ mat[i][n-i-1];
        }
        System.out.println(sum);
    }
}