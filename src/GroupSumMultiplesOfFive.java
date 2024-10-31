import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupSumMultiplesOfFive {
    /*
        Input: An array of integers taken as a list and a target sum to be reached
        Output: a Boolean to specify if target sum can be met with the numbers
         and if there is a multiple of five.
        Process: - Take an array of integers and the target sum as global
                 - introduce 2 functions, a helper and groupSum5
                 - the sum5 function would split multiples of 5 by themselves
                 - a sum pf those elements would be checked if they meet target
                 - if they don't then it accesses the helper function
                 - the helper function would then take input of the sum and adjusted list
                 - it would iterate to get to the target, once it is met it returns true

                */
    static List<Integer> nums = new ArrayList<>(Arrays.asList(2, 5, 1, 4));
    static Integer target = 6;

    static List<Integer> tempListMultiples = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(helperSumChecker());

    }

    public static Boolean helperSumChecker() {

        Integer sumFive = 0;
        for (Integer num : nums) {
            if (num % 5 == 0) {
                tempListMultiples.add(num);
                sumFive += num;
            }
        }

        if (sumFive == target) {
            return true;
        } else if (followedByOne(nums, 0) == false) {
            for (Integer tempNum : tempListMultiples) {
                nums.remove(tempNum);
            }
            return groupSum5(0, nums, target, sumFive);

        } else {
            return false;
        }
    }


    public static Boolean groupSum5(Integer index, List<Integer> nums, Integer target, Integer sumFive) {

        if (sumFive + nums.get(index) == target) {
            return true;
        } else if (index == nums.size() - 1) {
            return false;
        } else {
            return groupSum5(index + 1, nums, target, sumFive);
        }
    }

    public static Boolean followedByOne(List<Integer> nums, Integer index) {
        if ((nums.get(index) % 5 == 0) && (nums.get(index + 1) == 1)) {
            return true;
        } else if (index == nums.size() - 1) {
            return false;
        } else {
            return followedByOne(nums, index + 1);
        }
    }
}

