class RemoveSpecificElement{
    public static void main(String args[]){
        int originalArray[]={34,32,1,2,4,3,9};
        int key=32;

        for(int i=0;i<originalArray.length; i++){
            if(originalArray[i]== key){
                originalArray[i]=originalArray[originalArray.length-1];
                originalArray[originalArray.length-1]=0;
            }
        }

        System.out.print("New Array : ");
        for(int i=0;i<originalArray.length; i++){
            System.out.print(originalArray[i]+", ");
        }
    }
}