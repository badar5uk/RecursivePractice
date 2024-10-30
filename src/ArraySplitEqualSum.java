
import java.util.List;

public class ArraySplitEqualSum {
    /*
    Input: An array of integers taken as a list.
    Output: a Boolean to specify if the integers can be split into twwo arrays
            with their sum being equal to each other
    Process: - Take an array of integers a global
             - introduce 2 functions, a helper and the split function
             - the split function would first check if the sum of the numbers is even or odd
               this would check if they can be split equally.

             -The helper function would then be accessed by the split function
             - the function would increment the index and go through the list while subtracting
               from the target sum each time until we reach zero
             - if the index reaches the end of the list it and the sum subtraction isnt met
                it would return false
     */

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

