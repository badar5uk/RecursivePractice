import java.util.Arrays;
import java.util.List;

public class GroupSumClumpIdentical {

    /* Input: Array of Integers and a target sum to be reached
    Output: a true or false statement
    Process: - The array of integers is checked for any adjacent identicals
             - if found, it adds it to a variable called twin
             - if not it adds the number to sum and moves to the next
             - each iteration it checks recursively for the sum and the twin
             - if none are found, it would try and sum the non identical values to reach the target.System.out.println("Enter School Name, enter 0 to end: ");

     */
    static List<Integer> nums = Arrays.asList(2,4,4,8);
    static Integer target = 14;


    public static void main(String[] args) {
        System.out.println(groupSumClump( 0, nums, target, 0, 0));

    }


    public static Boolean groupSumClump(Integer index, List<Integer> nums, Integer target, Integer sum, Integer twin) {
        if (sum + twin == target) {
            return true;
        } else if (index == (nums.size() - 1)) {
            sum = 0;
            twin = 0;
            return groupSumClump(index +1 , nums, target, sum, twin);
        }else if (index < nums.size() - 1  && nums.get(index) != nums.get(index + 1)) {
            sum += nums.get(index);
            return groupSumClump(index + 1, nums, target, sum, twin);
        } else if (index < nums.size() - 1 && nums.get(index) == nums.get(index + 1)) {
            twin = nums.get(index);
            return groupSumClump(index + 2, nums, target, sum, twin * 2);
        } else if (index >= nums.size()) {
            return false;
        } else {
            return false;
        }
    }
}


