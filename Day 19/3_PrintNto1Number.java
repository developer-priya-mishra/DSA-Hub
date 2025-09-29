class PrintNto1Number{
    static void number(int count){
        if(count == 0 ) return;
        System.out.print(count+", ");
        count--;
        number(count);
    }

    public static void main(String args[]){
        int count =11;
        number(count);
    }
}