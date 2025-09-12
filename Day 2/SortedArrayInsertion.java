class SortedArrayInsertionAtBeg{
    public static void main(String args[]){
        int originalArray[]={1,2,3,4,5,6,7,8,9};
        int index=0;
        int key=0;
        
        int newArray[]= new int[originalArray.length+1];

        newArray[index]=key;

        for(int i=0;i<originalArray.length ; i++){
            newArray[i+1] = originalArray[i];
        }

        System.out.print("New Array is : ");
        for(int i=0;i<newArray.length ; i++){
            System.out.print(newArray[i]+" ,");
        }

    }
}

class SortedArrayInsertionAtMid{
    public static void main(String args[]){
        int originalArray[]={1,2,3,4,6,7,8,9};
        int index=4;
        int key=5;

        int newArray[]= new int[originalArray.length+1];
        newArray[originalArray.length]=key;
       
        for(int i=0;i<originalArray.length ; i++){
            newArray[i] = originalArray[i];
        }

        for(int i=newArray.length-1; i> index ; i--){
            newArray[i] = newArray[i-1];
        }

        newArray[index] = key;

        System.out.print("New Array is : ");
        for(int i=0;i<newArray.length ; i++){
            System.out.print(newArray[i]+" ,");
        }

    }
}

class SortedArrayInsertionAtEnd{
    public static void main(String args[]){
        int originalArray[]={1,2,3,4,5,6,7,8};
        int index=originalArray.length;
        int key=9;

        int newArray[]= new int[originalArray.length+1];
        newArray[index]=key;
       
        for(int i=0;i<originalArray.length ; i++){
            newArray[i] = originalArray[i];
        }

        System.out.print("New Array is : ");
        for(int i=0;i<newArray.length ; i++){
            System.out.print(newArray[i]+" ,");
        }

    }
}