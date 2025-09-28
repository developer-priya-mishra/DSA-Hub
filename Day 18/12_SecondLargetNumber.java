class SecondLargetNumber{
    public static void main(String args[]){
        int nums[]={1,2,3,4,102,34,101};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i]> largest){
                secondLargest=largest;
                largest=nums[i];
            }else if(nums[i] < largest && nums[i] > secondLargest){
                secondLargest=nums[i];
            }
        }
        System.out.print("Second largest number is "+secondLargest);
    }
}