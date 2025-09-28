class RemoveDuplicates{
    public static void main(String args[]){
       int nums[]={0,23,12,12,34,54,2,3,1,2,3,23,34};
       int index=0;
       int temp[]=new int[nums.length-1];

       for(int i=0;i<nums.length;i++){
        boolean isFound=false;
        loop:for(int j=0;j<i;j++){
                if(temp[j]==nums[i]){
                    isFound=true;
                    break loop;
                }
            }
        if(!isFound){
            temp[index++]=nums[i];
        }
       }

       for(int i=0;i<index;i++){
            System.out.print(temp[i]+", ");
        }

    }
}