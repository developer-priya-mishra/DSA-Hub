class PrintCalcPower{

    public static void calcPower(int x,int n ,int result){
        if(n==0){
            System.out.print(result);
            return;
        }
        result*=x;
        calcPower(x,n-1,result);
    }

    public static void main(String args[]){
        calcPower(2,5,1);
    }
}