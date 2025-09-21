import java.util.*;
class UnsortedArrayDeletion{
    public static void main(String args[]){
        int nums[] = {23,43,12,45,67,43,32};
        int position = 4;

        int temp=nums[nums.length-1];
        nums[position-1] = temp;
        nums[nums.length-1] = 0;

        System.out.print("Array are "+Arrays.toString(nums));
    }
}