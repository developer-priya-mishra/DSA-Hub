class MergeSortedArray{
    public static void main(String args[]){
        int array1[]={1,2,3,4};
        int array2[]={5,6,7,8};
        int index1=array1.length;
        int index2=array2.length;

        int newArray[]=new int[index1 + index2];
        
        for(int i=0;i<index1;i++){
            newArray[i] = array1[i];
        }

        for(int i=0;i<index2;i++){
            newArray[index1] = array2[i];
            index1++;
        }

        System.out.print("New Array : ");
        for(int i=0;i<newArray.length;i++){
            System.out.print(newArray[i]+", ");
        }
    }
}