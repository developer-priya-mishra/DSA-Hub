class RightRotateArrayByDPlace {
    public static void main(String args[]){
        int nums[] ={5,6,7,8,1,2,3,4};
        int k=4;
        int temp[]=new int[k];

        int n=nums.length;

        for (int i = 0; i < k; i++) {
            temp[i] = nums[n - k + i];
        }

        for (int i = n - 1; i >= k; i--) {
            nums[i] = nums[i - k];
        }

        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
    }
}