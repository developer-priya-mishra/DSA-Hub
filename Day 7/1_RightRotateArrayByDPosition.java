class RightRotateArrayByDPosition{
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8,9};
        int k=3;
        k = k % arr.length;
        int n=arr.length;
        int temp[]=new int[arr.length];
        int index=0;
        
        for(int i=n-k ; i<n; i++){
            temp[index++] = arr[i];
        }

        for(int i=0; i<n-k; i++){
            temp[index++] = arr[i];
        }

        for(int i=0; i<n; i++){
            arr[i] = temp[i];
        }

        System.out.println("New Array are : ");
        for(int i=0; i<n; i++){
           System.out.print(arr[i]+", ");
        }

    }
}