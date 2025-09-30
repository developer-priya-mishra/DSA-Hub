class PrintFibonacciSeries{
    public static void fibSeries(int i,int a, int b, int sum, int n){
        if(i==n){
            sum=a+b;
            System.out.print(sum);
            return;
        }
        sum = a+b;
        System.out.print(sum+", ");
        a=b;
        b=sum;
        fibSeries(i+1,a,b,sum,n);
    }

    public static void main(String args[]){
        System.out.print("0, 1, ");
        fibSeries(3,0,1,0,10);
    }
}