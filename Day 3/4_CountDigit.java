class CountDigit{
    public static void main(String args[]){
        int num=12332;
        int temp=num;
        int count=0;

        while(temp!=0){
            count++;
            temp = temp/10;
        }

        System.out.print("Digits in "+num+" is : "+count);
    }
}