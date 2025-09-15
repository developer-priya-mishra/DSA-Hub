class LeftRotateArrayByDPlace{
     public static void main(String args[]){
        int nums[] ={5,6,7,8,1,2,3,4};
        int k=4;
        k=k%nums.length;
        int temp[]=new int[k];
        for(int i=0;i<k ; i++){
            temp[i]=nums[i];
        }

        int index1=0;
        for(int i=k;i<nums.length ; i++){
            nums[index1]=nums[i];
            index1++;
        }

        int index2=0;
        for(int i=index1;i<nums.length ; i++){
            nums[i]= temp[index2];
            index2++;
        }

        for(int i=0;i<nums.length ; i++){
            System.out.print(nums[i]+", ");
        }
     }
}