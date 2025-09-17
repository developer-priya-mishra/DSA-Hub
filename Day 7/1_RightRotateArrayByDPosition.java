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


class RightRotateArrayByD{

    static void reverse(int arr[],int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void rightRotate(int arr[],int k){
        int n=arr.length;
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-k-1);
        reverse(arr,0,n-1);
    }

    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8,9};
        int k=3;
        k = k % arr.length;

        rightRotate(arr,k);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}