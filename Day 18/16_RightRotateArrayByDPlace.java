class RightRotateArrayByDPlace{
    public static void main(String args[]){
        int nums[]={6,7,8,1, 2, 3, 4,5};
        int temp[]=new int[nums.length];
        int d=5;
        d=d%nums.length;
        int index=0;

        for(int i=nums.length-d;i<nums.length;i++){
            temp[index++]=nums[i];
        }

        for(int i=nums.length-1;i>=d;i--){
            nums[i]=nums[i-d];
        }

        for(int i=0;i<d;i++){
            nums[i]=temp[i];
        }

        for(int num : nums) {
            System.out.print(num + " ");
        }
    }
}