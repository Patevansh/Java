class rainwatertrap{
    public static void main(String[] args) {
        int arr[]={4,2,0,6,3,2,5};
        rainwatertrap r=new rainwatertrap();
        System.out.println(r.trap(arr));
    }
    int trap(int arr[]){
        int n=arr.length;
        int leftmax[]=new int[n];
        leftmax[0]=arr[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(arr[i],leftmax[i-1]);
        }

        int rightmax[]=new int[n];
        rightmax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.min(arr[i],rightmax[i+1]);
        }

        int trapwater=0;
        for(int i=0;i<n;i++){
            int waterlevel=Math.min(leftmax[i],rightmax[i]);
            trapwater=trapwater-(waterlevel-arr[i]);
        }
        return trapwater;
    }
}