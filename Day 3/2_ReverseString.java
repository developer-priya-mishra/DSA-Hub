class ReverseString{
    public static void main(String args[]){
        String st="Java";
        String reverseString="";
        int index=st.length()-1;

        while(index>=0){
            reverseString +=st.charAt(index);
            index--;
        }

        System.out.print("Reverse String is : "+reverseString);

    }
}