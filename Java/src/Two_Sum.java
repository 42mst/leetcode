import java.util.Arrays;
import java.util.HashMap;

class Two_Sum {
    public int[] twoSum(int[] numbers, int target) {

        HashMap<Integer,Integer> indexMap = new HashMap<Integer,Integer>();
        for(int i = 0; i < numbers.length; i++){
            Integer requiredNum = (Integer)(target - numbers[i]);

            if(indexMap.containsKey(requiredNum)){
                int toReturn[] = {indexMap.get(requiredNum), i};
                return toReturn;
            }

            indexMap.put(numbers[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};

        Two_Sum s = new Two_Sum();
        
        System.out.println(Arrays.toString(s.twoSum(nums, 9)));
    }
}