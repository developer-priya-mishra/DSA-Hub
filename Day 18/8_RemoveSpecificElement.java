class RemoveSpecificElement{
    public static void main(String args[]){
        int nums[]={1, 2, 3, 4, 3, 5,5,7};
        int key=3;
        int temp[]=new int[nums.length];
        int index=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=key){
                temp[index++]=nums[i];
            }
        }

        for(int i=0;i<index;i++){
            System.out.print(temp[i]+", ");
        }
    }
}