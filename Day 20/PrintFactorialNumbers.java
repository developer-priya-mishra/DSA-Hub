class PrintFactorialNumbers{
    public static void factorialOfNumber(int i, int fact){
        if(i==1){
            fact*=i;
            System.out.print(fact);
            return;
        }
        fact*=i;
        factorialOfNumber(i-1,fact);
    }

    public static void main(String args[]){
        factorialOfNumber(5,1);
    }
}