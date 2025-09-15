class ArrayIsSorted{
    public static void main(String args[]){
        int arr[]={1,21,34,220,300};
        boolean isSorted=false;

        for(int i=0; i<arr.length-1 ; i++){
            if(arr[i] < arr[i+1]){
                isSorted= true;
            }else{
                isSorted = false;
                break;
            }
        }

        if(isSorted){
            System.out.print("Array is sorted");
        }else{
            System.out.print("Array is not sorted");
        }
    }
}