
import java.util.List;

public class ArraySplitEqualSum {

    static List<Integer> nums = List.of(2,3,5);

    public static void main(String[] args) {
        System.out.println(splitArray(nums));

    }

    public static Boolean splitArray(List<Integer> nums) {
        Integer sum = 0;
        for (Integer number : nums) {
            sum += number;
        }
        if (sum % 2 != 0) {
            return false;
        }
        Integer target = sum / 2;
        return helperFunctionSplit(nums, 0, target);
    }

    public static Boolean helperFunctionSplit(List<Integer> nums, Integer index, Integer target) {
        if (target == 0) {
            return true;
        } else if (index >= nums.size()) {
            return false;
        } else if (helperFunctionSplit(nums,index + 1, target - nums.get(index))){
            return true;
        }
        return helperFunctionSplit(nums, index + 1, target);
    }
}

