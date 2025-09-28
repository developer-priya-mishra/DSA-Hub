class SortedArrayInsertion{
    public static void main(String args[]){
        int nums[]={1,2,3,4,6,8};
        int position=5;
        int index=position-1;
        int key=5;
        int temp[]=new int[nums.length+1];

        for(int i=0;i<index;i++){
            temp[i] = nums[i];
        }

        temp[index]=key;

        for(int i=index;i<nums.length;i++){
            index++;
            temp[index] = nums[i];
        }

        for(int i=0;i<temp.length;i++){
            System.out.print(temp[i]+", ");
        }
    }
}