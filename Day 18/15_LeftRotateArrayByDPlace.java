class LeftRotateArrayByDPlace{
    public static void main(String args[]){
        int nums[]={6,7,8,1, 2, 3, 4,5};
        int temp[]=new int[nums.length];
        int d=3;

        for(int i=0;i<d;i++){
            temp[i]=nums[i];
        }

        int index=0;
        for(int i=d;i<nums.length;i++){
            nums[index++]=nums[i];
        }

        index=0;
        for(int i=nums.length-d;i<nums.length;i++){
            nums[i]=temp[index++];
        }

        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+", ");
        }
    }
}