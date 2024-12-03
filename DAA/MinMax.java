package DAA;

public class MinMax {
    static class pair{
        int min,max;
        pair(int min,int max){
            this.min=min;
            this.max=max;
           
        }
    }
    public static void main(String[] args) {
        int arr[]={9,6,3,7,10,14,8,11};
        pair res=findminmax(arr,0,arr.length-1);
        System.out.println("max is : "+res.max+"Min is : "+res.min);
    }
    private static pair findminmax(int arr[],int low, int high){
        if(low==high){
            return new pair(arr[low], arr[low]);
        }
        else if(high==low+1){
            if(arr[low]<arr[high]){
                return new pair(arr[low], arr[high]);
            }
            else{
                return new pair(arr[high],arr[low]);
            }
        }
        int mid=(low+high)/2;
        pair leftpair=findminmax(arr, low, mid);
        pair rightpair=findminmax(arr, mid+1, high);

        int allovermin=Math.min(leftpair.min,rightpair.min);
        int allovermax=Math.max(leftpair.max,rightpair.max);
        
        return new pair(allovermin, allovermax);
    }
}
