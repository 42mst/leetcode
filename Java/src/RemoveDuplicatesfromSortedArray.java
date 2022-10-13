import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        int tmp = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i-1]){
                nums[++tmp] = nums[i];
            }
        }

        return ++tmp;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,1,2};
        RemoveDuplicatesfromSortedArray r = new RemoveDuplicatesfromSortedArray();

        System.out.println(r.removeDuplicates(nums1));
        System.out.println(Arrays.toString(nums1));
    }
}
