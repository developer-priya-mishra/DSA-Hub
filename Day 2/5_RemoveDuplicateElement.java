class RemoveDuplicateElement{
    public static void main(String args[]){
        int originalArray[]={1,1,2,4,6,2,9,3};

        int newArray[] = new int[originalArray.length];
        int newIndex=0;

        for(int i=0;i<originalArray.length;i++){
            boolean isFound=false;
            for(int j=0; j < newIndex ; j++){
                if(newArray[j] == originalArray[i]){
                    isFound=true;
                }
            }

            if(!isFound){
                newArray[newIndex] = originalArray[i];
                newIndex++;
            }
        }

        System.out.print("New Array after removing duplicate element is : ");
        for(int i=0;i<newArray.length  ; i++){
            System.out.print(newArray[i]+" ,");
        }
    }
}