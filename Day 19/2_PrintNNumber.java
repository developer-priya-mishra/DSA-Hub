class PrintNNumber{
    static void number(int count){
        if(count == 6 ) return;
        System.out.print(count+", ");
        count++;
        number(count);
    }

    public static void main(String args[]){
        int count =1;
        number(count);
    }
}