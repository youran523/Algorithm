public class MergeArray {
    public static void main(String[] args) {
        int nums[] = new int[]{1,1,3,0,0,0};
        int num2[] = new int[]{2,5,6};
        merge(nums,3,num2,3);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int mergeLen = m+ n;
        int j = mergeLen -1;

        while(m > 0 && n > 0) {
            if(nums1[m-1] >= nums2[n-1])
            {
                nums1[j] = nums1[m-1];
                m --;
            }else {
                nums1[j] = nums2[n-1];
                n -- ;
            }
            j--;
        }

        int len = m + n;
        for(int i = m + n -1 ; i >=0 ;i--){
            nums1[j] = m == 0? nums2[i]: nums1[i];
            j--;
        }
    }
}
