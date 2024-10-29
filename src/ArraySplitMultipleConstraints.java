
import java.util.List;

public class ArraySplitMultipleConstraints {

    static List<Integer> nums = List.of(6, 9, 10, 5);

    public static void main(String[] args) {
        System.out.println(split53(nums));

    }

    public static Boolean split53(List<Integer> nums) {
        Integer sum = 0;
        for (Integer number : nums) {
            sum += number;
        }
        if (sum % 2 != 0) {
            return false;
        }
        Integer totalSum = sum / 2;
        return helperFunctionSplit(nums, 0, totalSum, 0, 0);
    }

    public static Boolean helperFunctionSplit(List<Integer> nums, Integer index, Integer totalSum, Integer sumFive, Integer sumThree) {

        if (index == nums.size()) {
            return sumFive == totalSum && sumThree == totalSum;
        }
        Integer num = nums.get(index);
        if (num % 5 == 0) {
            return helperFunctionSplit(nums, index + 1, totalSum, sumFive + num, sumThree);
        } else if (num % 3 == 0) {
            return true;
        } else if (index % 3 == 0) {
            helperFunctionSplit(nums, index + 1, totalSum, sumFive, sumThree + num);
        }

        return helperFunctionSplit(nums, index + 1, totalSum, sumFive+num, sumThree) ||
                helperFunctionSplit(nums, index + 1, totalSum, sumFive, sumThree+num);
    }
}

