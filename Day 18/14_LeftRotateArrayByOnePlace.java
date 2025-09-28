class LeftRotateArrayByOnePlace{
    public static void main(String args[]){
        int nums[]={6,1, 2, 3, 4,5};
        int temp=nums[0];
        int index=0;
        
        for(int i=0;i<nums.length-1;i++){
            nums[i]=nums[i+1];
        }
        nums[nums.length-1]=temp;

        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+", ");
        }
    }
}