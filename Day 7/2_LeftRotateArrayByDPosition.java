class LeftRotateArrayByDPosition{
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8,9};
        int n=arr.length;
        int k=3;
        k=k%n;
        int index=0;
        int temp[]=new int[n];

        for(int i=k;i<n; i++){
            temp[index++] =arr[i];
        }

        for(int i=0;i<k; i++){
            temp[index++] =arr[i];
        }

        for(int i=0;i<n; i++){
            arr[i] = temp[i];
        }

        System.out.println("New Array are : ");
        for(int i=0; i<n; i++){
           System.out.print(arr[i]+", ");
        }


    }
}