class ReverseNumber{
    public static void main(String args[]){
        int num= 124536;
        int temp=num;
        int reverseNum=0;

        while(temp!=0){
            int remainder = temp%10;
            reverseNum = reverseNum*10 + remainder;
            temp = temp / 10;
        }

        System.out.print("Reverse of "+num+" is : "+reverseNum);
    }
}