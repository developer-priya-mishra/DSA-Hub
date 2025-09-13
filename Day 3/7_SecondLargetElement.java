class SecondLargetElement{
    public static void main(String args[]){
        int num[]={12,21,34,23,55,948938,100,84983,200};
        int largestElement=Integer.MIN_VALUE;
        int secondLargestElement = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {
            if (num[i] > largestElement) {
                secondLargestElement = largestElement;
                largestElement = num[i];
            } else if (num[i] > secondLargestElement && num[i] != largestElement) {
                secondLargestElement = num[i];
            }
        }
        System.out.print("Second Largest Element is : "+secondLargestElement);
    }
}