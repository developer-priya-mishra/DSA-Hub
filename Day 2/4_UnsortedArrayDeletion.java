class UnsortedArrayDeletionAtBeg{
    public static void main(String args[]){
        int originalArray[]={34,32,1,2,4,3,9};
        int position=0;
        
        originalArray[position]=originalArray[originalArray.length-1];

        System.out.print("New Array is : ");
        for(int i=0;i<originalArray.length-1 ; i++){
            System.out.print(originalArray[i]+" ,");
        }

    }
}

class UnsortedArrayDeletionAtMid{
    public static void main(String args[]){
        int originalArray[]={34,32,1,2,100,3,9};
        int position=5;
       
        originalArray[position-1]=originalArray[originalArray.length-1];

        System.out.print("New Array is : ");
        for(int i=0;i<originalArray.length -1 ; i++){
            System.out.print(originalArray[i]+" ,");
        }

    }
}

class UnsortedArrayDeletionAtEnd{
    public static void main(String args[]){
        int originalArray[]={34,32,1,2,4,3,9,0};

        System.out.print("New Array is : ");
        for(int i=0;i<originalArray.length-1 ; i++){
            System.out.print(originalArray[i]+" ,");
        }

    }
}