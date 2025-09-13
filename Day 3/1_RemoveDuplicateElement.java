class RemoveDuplicateElement{
    public static void main(String args[]){
        int originalArray[]={1,2,1,3,2,4,3,5,6};

        int newArray[] = new int[originalArray.length];

        int newIndex=0;
        

        for(int i=0;i<originalArray.length;i++){
            boolean isFound=false;

            loop:for(int j=0; j<i ; j++){
                if(newArray[j] == originalArray[i]){
                    isFound=true;
                    break loop;
                }
            }

            if(!isFound){
                newArray[newIndex]=originalArray[i];
                newIndex++;
            }
        }

        System.out.print("New Array after removing duplicate elements : ");
        for(int i=0;i<newArray.length;i++){
            System.out.print(newArray[i]+", ");
        }
    }

}