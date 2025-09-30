class ArrayIsSorted{
    public static boolean arrSorted(int nums[],int i){
        if(i==nums.length-1){
            return true;
        }
        if(nums[i+1]>nums[i]){
            return arrSorted(nums,i+1);
        }else{
            return false;
        }
    }

    public static void main(String args[]){
        int nums[]={1,2,3,4,5,0};
        System.out.print("Array is sorted : "+ arrSorted(nums,0));
    }
}