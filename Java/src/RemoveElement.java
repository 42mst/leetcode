public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0){
            return 0;
        }
        
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val){
                nums[result] = nums[i];
                result++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array1 = {3,2,2,3};
        RemoveElement r = new RemoveElement();

        System.out.println(r.removeElement(array1, 2));
    }
}
