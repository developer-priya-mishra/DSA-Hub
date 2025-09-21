class LinearSearch{
    public static void main(String args[]){
        int nums[] = {23,21,11,34,42,13,35,211,100};
        int key=1000;
        boolean isFound=false;

        for(int i=0; i<nums.length ; i++){
            if(nums[i]==key){
                isFound=true;
                System.out.print("Key found at index "+i);
                break;
            }
        }

        if(!isFound){
            System.out.print("Key not found");
        }
    }
}