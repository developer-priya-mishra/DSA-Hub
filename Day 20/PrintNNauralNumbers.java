class PrintNNauralNumbers{

    public static void sumofNaturalNumber(int i, int n,int sum){
        if(i==11){
            sum+=i;
            System.out.print(sum);
            return;
        }

        sum+=i;
        sumofNaturalNumber(i+1,n,sum);
    }

    public static void main(String args[]){
        sumofNaturalNumber(1,11,0);
    }
}