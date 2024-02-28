public class SortedMatrix {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
        SortedMatrix s=new SortedMatrix();
        s.sort(arr, 12);
    }
    void sort(int mat[][],int f){
        int n=mat.length;
        int l=mat[0].length-1;
        int tr=0;
        while (tr!=n && l!=-1){
            if (mat[tr][l]==f){
                System.out.println("Element found");
                return;
            }
            else if(mat[tr][l]<f){
                tr++;
            }
            else if(mat[tr][l]>f){
                l--;
            }
        }
        System.out.println("Element not found");
    }
}
