
public class buysell {
    public static void main(String[] args) {
        int arr[]={7,1,5,4,9,3,1,8};
        System.out.println(profit(arr));
    }
    public static int profit(int arr[]){
        int buyprice=arr[0];
        int sellprice=arr[1];
        int pro=0;
        for(int i=1;i<arr.length;i++){
            if (buyprice>arr[i]){
                buyprice=arr[i];
                sellprice=arr[i];
            }
            if(pro<sellprice-buyprice){
                pro=sellprice-buyprice;
            }
            if (sellprice<arr[i]){
                sellprice=arr[i];
            }
        }
        if(pro<sellprice-buyprice){
            pro=sellprice-buyprice;
        }
        return pro;
    }
    
}