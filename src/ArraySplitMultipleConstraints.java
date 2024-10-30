
import java.util.List;

public class ArraySplitMultipleConstraints {

    /*
    Input: An array of integers taken as a list.
    Output: a Boolean to specify if the integers can be split into two arrays
            with their sum being equal to each other, this would also check if the two
            sub arrays contain multiples 5 and 3.
    Process: - Take an array of integers a global
             - introduce 2 functions, a helper and the split function
             - the split function would first check if the sum of the numbers is even or odd
               this would check if they can be split equally.

             -The helper function would then be accessed by the split53 function
             - the numbers would be checked if are multiples of 5 or 3
             - they would be separated into two different arrays by checking if the modulus of the
                number equals 0.

     */

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

