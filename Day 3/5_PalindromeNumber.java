class PalindromeNumber{
    public static void main(String args[]){
        int num=12211;
        int temp=num;
        int reverseNum=0;

        while(temp!=0){
            int remainder=temp%10;
            reverseNum = reverseNum*10+remainder;
            temp = temp/10;
        }
        
        if(num == reverseNum){
            System.out.print(num+" is Palindrome Number");
        }else{
            System.out.print(num+" is not a Palindrome Number");
        }
    }
}