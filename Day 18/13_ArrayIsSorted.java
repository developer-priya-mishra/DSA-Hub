class ArrayIsSorted{
    public static void main(String args[]){
        int nums[]={1, 2, 3, 4, 3, 5,5,7};
        boolean ascending=true;
        boolean descending=true;

        for(int i=0;i<nums.length; i++){
            if(nums[i+1] > nums[i]){
                descending=false;
                break;
            }
            if(nums[i+1] < nums[i]){
                ascending=false;
                break;
            }
        }

        if(ascending) {
            System.out.println("Array is sorted in ascending order.");
        } else if(descending) {
            System.out.println("Array is sorted in descending order.");
        } else {
            System.out.println("Array is not sorted.");
        }
    }
}