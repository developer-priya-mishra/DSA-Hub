class PrintFibonacciSeries{
    public static void fibSeries(int a, int b,int n){
        if(n==0){
            return;
        }
        int sum = a+b;
        System.out.print(sum+", ");
        fibSeries(b,sum,n-1);
    }

    public static void main(String args[]){
        int a=0;
        int b=1;
        System.out.print(a+", "+b+", ");
        int n=7;
        fibSeries(a,b,n-2);
    }
}