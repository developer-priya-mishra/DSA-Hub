import java.util.*;
class RemoveDuplicates{
    public static void main(String args[]){
        int nums[]={100,2,3,2,3,2,1,3,4};
        int index=0;
        int temp[]= new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            boolean isFound=false;
            loop:for(int j=0;j<i;j++){
                if(nums[i]==nums[j]){
                    isFound=true;
                    break loop;
                }
            }
            if(!isFound){
                temp[index++]=nums[i];
            }
        }

        System.out.print("Array are "+Arrays.toString(temp));

    }
}