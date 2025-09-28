class PalindromeNumber{
    public static void main(String args[]){
        int num=1221;
        int temp=num;
        int reverseNumber=0;

        while(temp!=0){
            int remainder=temp%10;
            reverseNumber = reverseNumber*10+remainder;
            temp=temp/10;
        }

        if(num==reverseNumber){
            System.out.print("This is a Palindrome Number");
        }else{
            System.out.print("This is not a Palindrome Number");
        }
    }
}