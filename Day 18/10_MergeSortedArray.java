class MergeSortedArray{
    public static void main(String args[]){
        int nums1[]={1,2,3,4};  
        int nums2[]={5,6,7,8};
        int newNum[]=new int[nums1.length+nums2.length];

        for(int i=0;i<nums1.length;i++){
            newNum[i]=nums1[i];
        }

        int index=nums2.length;

        for(int i=0;i<nums2.length;i++){
            newNum[index++]=nums2[i];
        }

        for(int i=0;i<newNum.length;i++){
            System.out.print(newNum[i]+", ");
        }
    }
}