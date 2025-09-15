class RightRotateArrayByDPlace {
    public static void main(String args[]){
        int nums[] ={5,6,7,8,1,2,3,4};
        int k=4;
        int temp[]=new int[k];

        int index1=0;
        for(int i=k;i<nums.length ; i++){
            temp[index1]=nums[i];
            index1++;
            
        }

        int index2=k;
        for(int i=0;i<k ; i++){
            nums[index2]=nums[i];
            index2++;
        }

        for(int i=0;i<k ; i++){
            nums[i]= temp[i];
        }
        

        for(int i=0;i<nums.length ; i++){
            System.out.print(nums[i]+", ");
        }
    }
}