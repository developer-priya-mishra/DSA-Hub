class SortedArrayDeletionAtBeg{
    public static void main(String args[]){
        int originalArray[]={0,1,2,3,4,5,6,7,8,9};
        
        for(int i=0;i< originalArray.length-1 ; i++){
            originalArray[i] = originalArray[i+1];
        }

        System.out.print("New Array is : ");
        for(int i=0;i < originalArray.length-1 ; i++){
            System.out.print(originalArray[i]+" ,");
        }

    }
}

class SortedArrayDeletionAtMid{
    public static void main(String args[]){
        int originalArray[]={1,2,3,4,0,6,7,8,9};
        int position=5;

        for(int i=position-1; i< originalArray.length-1 ; i++){
            originalArray[i] = originalArray[i+1];
        }


        System.out.print("New Array is : ");
        for(int i=0;i<originalArray.length-1 ; i++){
            System.out.print(originalArray[i]+" ,");
        }

    }
}

class SortedArrayDeletionAtEnd{
    public static void main(String args[]){
        int originalArray[]={1,2,3,4,5,6,7,8};

        int newArray[]= new int[originalArray.length-1];
       
        for(int i=0; i < originalArray.length-1 ; i++){
            newArray[i] = originalArray[i];
        }

        System.out.print("New Array is : ");
        for(int i=0;i<newArray.length ; i++){
            System.out.print(newArray[i]+" ,");
        }

    }
}