class PrintStringInReverse{
    
    public static void reverseString(String str, int index, String reverseStr){
        if(index==0){
            reverseStr +=str.charAt(index);
            System.out.print(reverseStr);
            return;
        }
        reverseStr +=str.charAt(index);
        reverseString(str,index-1,reverseStr);
    }

    public static void main(String args[]){
        String str="abcd";
        int index=str.length()-1;
        String reverseStr="";
        reverseString(str,index,reverseStr);
    }
}