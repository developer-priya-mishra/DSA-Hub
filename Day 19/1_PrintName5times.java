class PrintName5times{
    static void name(int count){
        if(count == 6 ) return;
        System.out.println("Java :"+count);
        count++;
        name(count);
    }

    public static void main(String args[]){
        int count =1;
        name(count);
    }
}