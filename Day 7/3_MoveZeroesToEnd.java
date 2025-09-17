class MoveZeroesToEnd{
    public static void main(String args[]){
        int arr[]={0,1,2,0,0,4,0,100,32,4,0,0};
        int temp[]=new int[arr.length];
        int index=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                temp[index++]=arr[i];
            }
        }

        for(int i=0;i<arr.length;i++){
            arr[i]=temp[i];
        }

        for(int num:arr){
           System.out.print(num+", ");
        }
    }
}

class MoveZeroToEnd{
    public static void main(String args[]){
        int arr[]={0,1,2,0,0,4,0,100,32,4,0,0};
        int index=0;

        for(int i=0;i<arr.length ; i++){
            if(arr[i] !=0){
                arr[index++]=arr[i];
            }
        }

        while(index < arr.length){
            arr[index]=0;
            index++;
        }

        System.out.println("Array after moving zeroes to end:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}