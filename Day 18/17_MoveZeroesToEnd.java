class MoveZeroesToEnd{
    public static void main(String args[]){
        int nums[]={12,0,3,0,32,0,44,0,0,23,11,2};
        int index=0;
        int temp[]=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            if(nums[i] !=0){
                temp[index++]=nums[i];
            }
        }

        for(int num : temp) {
            System.out.print(num + " ");
        }
    }
}