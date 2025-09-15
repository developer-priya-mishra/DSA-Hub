class LeftRotateArrayByOnePlace{
    public static void main(String args[]){
        int arr[] ={5,1,2,3,4};
        int temp = arr[0];

        for(int i=0; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }

        arr[arr.length-1] = temp;
        System.out.print("New array is ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+", ");
        }
    }
}