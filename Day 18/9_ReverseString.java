class ReverseString{
    public static void main(String args[]){
        String str="JavaProgramming";
        String newStr="";

        for(int i=str.length()-1;i>=0;i--){
            newStr+=str.charAt(i);
        }
        System.out.print(newStr);
    }
}