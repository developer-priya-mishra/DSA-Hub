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


class LeftRotateArrayByD{
    static void reverse(int arr[], int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void rotateLeft(int arr[],int k){
        int n=arr.length;
        k=k%n;
        reverse(arr,k,n-1);
        reverse(arr,0,k-1);
        reverse(arr,0,n-1);

    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8,9};
        int k=3;

        rotateLeft(arr,k);

        for(int num : arr){
            System.out.print(num+", ");
        }
    }
}