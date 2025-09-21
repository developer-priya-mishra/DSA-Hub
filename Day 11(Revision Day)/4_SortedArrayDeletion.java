import java.util.*;
class SortedArrayDeletion{

    public static int findNumberIndex(int nums[],int key){
        int low=0;
        int high=nums.length-1;

        while(high >= low){
            int mid = low + ((high - low) / 2);
            if(nums[mid] == key){
                return mid; // if duplicates allowed, insert here
            } else if(nums[mid] > key){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }

    public static void main(String args[]){
        int nums[]={1,2,3,4,5,6,7,8};
        int key=5;
        int temp[]=new int[nums.length];

        int position = findNumberIndex(nums,key);

        System.arraycopy(nums,0,temp,0,position);

        System.arraycopy(nums,position+1,temp,position,nums.length-position-1);

        System.out.print("Array are "+Arrays.toString(temp));
    }
}