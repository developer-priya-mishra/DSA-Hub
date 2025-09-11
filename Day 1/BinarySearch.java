class BinarySearch{
    public static void main(String args[]){
        int num[]={1,2,3,4,5,6,7,8,9};
        int key=100;
        int low=0;
        int high=num.length-1;

        boolean notFound=true;

        while(low <= high){
            int mid=(low + high)/2;
            if(num[mid] == key){
                System.out.print("Number found at index "+mid);
                notFound = false;
                break;
            }else if(num[mid] > key){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        

        if(notFound) System.out.print("Number not found");
    }
}