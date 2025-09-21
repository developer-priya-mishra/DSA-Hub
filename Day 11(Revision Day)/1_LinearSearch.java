class LinearSearch{
    public static void main(String args[]){
        int nums[]={1,2,3,4,5};
        int key=40;
        int low=0;
        int high= nums.length -1;
        boolean isFound=false;

        while(high>= low){
            int mid=(low+high)/2;

            if(nums[mid]==key){
                isFound=true;
                System.out.print("Key found at index "+mid);
                break;
            }else if(nums[mid]> key){
                high = mid-1;
            }else{
                low = mid +1;
            }
        }

        if(!isFound){
            System.out.print("Key not found ");
        }
    }
}