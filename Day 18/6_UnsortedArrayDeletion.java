class UnsortedArrayDeletion{
    public static void main(String args[]){
        int nums[]={32,12,45,63,2,120,45,33,45};
        int position=5;
        int index=position-1;
        int temp[]=new int[nums.length-1];

        for(int i=0;i<index;i++){
            temp[i] = nums[i];
        }

        for(int i=index+1;i<nums.length;i++){
            temp[index++] = nums[i];
        }

        for(int i=0;i<temp.length;i++){
            System.out.print(temp[i]+", ");
        }
    }
}