class FirstAndLastOccurance{
    public static int firstOccurance = -1;
    public static int lastOccurance = -1;

    public static void firstOccurance(String str, int index, char element){
        if(index==str.length()){
            System.out.println("First Occurance : "+firstOccurance);
            System.out.println("Last Occurance : "+lastOccurance);
            return;
        }

        char currChar = str.charAt(index);
        if(currChar==element){
            if(firstOccurance==-1){
                firstOccurance = index;
            }else{
                lastOccurance = index;
            }
        }
        firstOccurance(str,index+1,element);
    }

    public static void main(String args[]){
        String str="abaaabchaak";
        firstOccurance(str,0,'a');
    }

}