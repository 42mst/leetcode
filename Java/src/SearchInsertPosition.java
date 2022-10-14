package Java.src;
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        /*
         * iterate over array
         * if target hits value return i
         * search until target equals value
         * if not target is bigger than any other value
         * so +1 of the initail array-size
         */
        int output = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target){
                output = i;
                break;
            }
            if(nums[i] < target){
                output++;
            }
        }


        return output;
         
    }

    public static void main(String[] args) {
        SearchInsertPosition s = new SearchInsertPosition();

        int[] nums1 = {1,3,5,6};
        int[] nums2 = {1,3};
        int[] nums3 = {1};
        int[] nums4 = {1,3,5};

        System.out.println(s.searchInsert(nums1, 5));
        System.out.println(s.searchInsert(nums1, 2));
        System.out.println(s.searchInsert(nums1, 7));
        System.out.println(s.searchInsert(nums2, 2));
        System.out.println(s.searchInsert(nums3, 1));
        System.out.println(s.searchInsert(nums3, 2));
        System.out.println(s.searchInsert(nums4, 2));


    }
}
