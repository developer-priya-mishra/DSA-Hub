import java.util.*;
class UnsortedArrayInsertion{
    public static void main(String args[]){
        int nums[] = {23,43,12,45,67,43,32};
        int position = 4;
        int index = position-1;
        int key=44;
        int temp[] = new int[nums.length+1];

        System.arraycopy(nums,0,temp,0,position-1);
        temp[position-1] = key;

        System.arraycopy(nums,position-1,temp,position,nums.length-index);

        System.out.print("Array are "+Arrays.toString(temp));

    }
}