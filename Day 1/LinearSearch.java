class LinearSearch{
    public static void main(String args[]){
        int num[]={2,43,12,0,5,95,45,34};
        int key=100;
        boolean notFound=true;

        for (int i=0; i<num.length; i++){
            if(key == num[i]){
                System.out.print("Number found a index "+i);
                notFound=false;
                break;
            }
        }

        if(notFound) System.out.print("Number not found");
    }
}