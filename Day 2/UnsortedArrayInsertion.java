class UnsortedArrayInsertionAtBeg{
    public static void main(String args[]){
        int originalArray[]={34,32,1,2,4,3,9,0};
        int position=0;
        int key=0;
        
        int newArray[]= new int[originalArray.length+1];
        
        newArray[position-1]=key;

        for(int i=0;i<originalArray.length ; i++){
            newArray[i+1] = originalArray[i];
        }

        System.out.print("New Array is : ");
        for(int i=0;i<newArray.length ; i++){
            System.out.print(newArray[i]+" ,");
        }

    }
}

class UnsortedArrayInsertionAtMid{
    public static void main(String args[]){
        int originalArray[]={34,32,1,2,4,3,9,0};
        int position=4;
        int key=5;

        int newArray[]= new int[originalArray.length+1];
       
        for(int i=0;i<originalArray.length ; i++){
            newArray[i] = originalArray[i];
        }

        newArray[newArray.length-1]=newArray[position-1];
        newArray[position-1] = key;

        System.out.print("New Array is : ");
        for(int i=0;i<newArray.length ; i++){
            System.out.print(newArray[i]+" ,");
        }

    }
}

class UnsortedArrayInsertionAtEnd{
    public static void main(String args[]){
        int originalArray[]={34,32,1,2,4,3,9,0};
        int position=originalArray.length;
        int key=9;

        int newArray[]= new int[originalArray.length+1];
        newArray[position]=key;
       
        for(int i=0;i< originalArray.length ; i++){
            newArray[i] = originalArray[i];
        }

        System.out.print("New Array is : ");
        for(int i=0;i<newArray.length ; i++){
            System.out.print(newArray[i]+" ,");
        }

    }
}