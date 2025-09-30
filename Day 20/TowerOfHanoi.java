class TowerOfHanoi{
    public static void towerOfHanoi(int n,String src,String helper, String destinantion){
        if(n==1){
            System.out.println("Disk is "+n+" transferred from "+src+" to "+destinantion);
            return;
        }
        towerOfHanoi(n-1,src,destinantion,helper);
        System.out.println("Disk is "+n+" transferred from "+src+" to "+destinantion);
        towerOfHanoi(n-1,helper,src,destinantion);
    }

    public static void main(String args[]){
        int n=5;
        towerOfHanoi(n,"S","H","D");
    }
}