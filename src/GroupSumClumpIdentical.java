import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

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
        System.out.println(groupSumClump( 0,0, nums, target, 0, 0));

    }


    public static Boolean groupSumClump(Integer start, Integer index, List<Integer> nums, Integer target, Integer sum, Integer twin) {
        List<Integer> newlist = new ArrayList<>(nums.subList(start, nums.size()));
        if (sum + twin == target || sum.equals(target)) {
            return true;
        }
        else if (index == (newlist.size() - 1)) {
            index = 0;
            return groupSumClump(1,index, newlist, target, 0, 0);
        }else if (index < newlist.size()  && !Objects.equals(newlist.get(index), newlist.get(index + 1))) {
            sum += newlist.get(index);
            return groupSumClump(0,index + 1, newlist, target, sum, twin);
        } else if (index < newlist.size()  && Objects.equals(newlist.get(index), newlist.get(index + 1))) {
            twin = newlist.get(index);
            return groupSumClump(0,index + 2, newlist, target, sum, twin * 2);
        } else {
            return false;
        }
    }
}


