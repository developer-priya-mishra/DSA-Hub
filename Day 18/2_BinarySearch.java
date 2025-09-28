class BinarySearch{
    public static void main(String args[]){
        int nums[]={1,2,3,4,34,101};
        int key=10;
        int left=0;
        int right=nums.length-1;
        boolean isFound=false;

        while(right >= left){
            int mid = (left+right)/2;
            if(nums[mid]==key){
                isFound=true;
                System.out.print("Number found at index "+mid);
                break;
            }else if(mid > key){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }

         if(!isFound) System.out.print("Number not found!");
    }
}