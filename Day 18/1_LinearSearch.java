class LinearSearch{
    public static void main(String args[]){
        int nums[]={32,12,45,63,2,120,45,33,45};
        int key=2;
        boolean isFound=false;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==key){
                isFound = true;
                System.out.print("Number found at index "+i);
                break;
            }
        }

        if(!isFound) System.out.print("Number not found!");
    }
}