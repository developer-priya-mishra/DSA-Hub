import java.util.*;

class SortedArrayInsertion{
    public static void main(String args[]){
        int nums[]={1,2,3,4,5,7,8,9};
        int key = 6;
        int position = 6;
        int temp[] = new int[nums.length +1];

        for(int i=0; i<position -1; i++){
            temp[i] = nums[i];
        }

        temp[position -1]= key;

        for(int i=position-1; i<nums.length; i++){
            temp[i+1] = nums[i];
        }

        System.out.print("Array are : ");
        for(int i=0; i<temp.length; i++){
            System.out.print(temp[i]+", ");
        }
    }
}


class SortedArrayInsertionOptimizedVersion{

    public static int findInsertInsert(int nums[],int key){
        int low = 0;
        int high= nums.length -1;

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
        int nums[]={1,2,3,4,5,7,8,9};
        int key = 6;
        int temp[] = new int[nums.length + 1];

        int position = findInsertInsert(nums,key);

        System.arraycopy(nums,0,temp,0,position);

        temp[position] = key;

        System.arraycopy(nums,position,temp,position+1,nums.length-position);    

        System.out.print("Array are "+Arrays.toString(temp));    
    }
}