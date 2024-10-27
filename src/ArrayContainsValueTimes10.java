public class ArrayContainsValueTimes10 {
    /*
    Objective: Create a recursive function that checks if an array of integers
    contains a value that is immediately followed by that value multiplied by 10.
    The function should start checking from the given index and move through the array
    recursively.

Requirements:

The function should be named array220.

The input parameters are:

nums: The array of integers.

index: The starting index for checking, initially passed as 0.

The function must:

Return false if the array has fewer than 2 elements remaining from the current index.

Recursively check if the element at the current index is followed by that element multiplied by 10 at the next index.

If not found, move to the next index by calling array220(nums, index + 1).

Avoid using loops.

Example Test Cases:

array220([1, 2, 20], 0) → true (2 is followed by 20)

array220([3, 30], 0) → true (3 is followed by 30)

array220([3], 0) → false (Array too short to have a match)


     */
    static Boolean checker = true;

    public static void main(String[] args) {
        Integer[] nums = {1, 2, 30};
        System.out.println(array220(nums, 0));

    }

    public static Boolean array220(Integer[] nums, Integer index) {

        if (nums.length - index <= 1) {
            checker = false;
            return checker;
        } else if (nums.length > 2) {
            if (nums[index + 1] == nums[index] * 10) {
                checker = true;
                return checker;
            } else {
                array220(nums, index + 1);
            }
        }
        return checker;
    }
}
