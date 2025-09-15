class RemoveDuplicates{
    public static void main(String args[]){
        int arr[]={1,1,2};
        int newArray[]=new int[arr.length];
        int newIndex=0;

        for(int i=0; i<arr.length ; i++){
            boolean isFound=false;
            for(int j=0; j<newIndex ; j++){            
                if(newArray[j]==arr[i]){
                    isFound=true;
                    break;
                }
            }
            if(!isFound){
                newArray[newIndex]=arr[i];
                newIndex++;
            }
        } 

        System.out.print("New Array is ");
        for(int i=0; i<arr.length; i++){
            System.out.print(newArray[i]+", ");
        }  
    }
}