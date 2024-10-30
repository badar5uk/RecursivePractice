import java.util.List;

public class NonAdjacentGroupSum {

    /*
        Input: An array of integers taken as a list and a target sum to be reached
        Output: a Boolean to specify if target sum can be met with non-adjacent numbers
        Process: - Take an array of integers and the target sum as global
                 - introduce 2 functions, a helper and groupNonAdj
                 - the groupNonAdj would check if the sum of number at index 0 and index 2
                   equal to the target
                 - if not it will access the helper function to iterate through the elements.
     */
    static List<Integer> nums = List.of(2,5,10,4);
    static Integer target = 12;

    public static void main(String[]args){
        System.out.println(groupNonAdj());
    }
    public static Boolean groupNonAdj(){
        Integer index = 0;
        if (nums.get(index) + nums.get(index + 2) == target){
            return true;
        } else {
            index = 2;
            return helper(index,nums,target);
        }

    }
    public static Boolean helper(Integer startIndex, List<Integer> nums, Integer target){
        if(nums.get(startIndex) + nums.get(0) == target){
            return true;
        } else if (startIndex == nums.size() - 1) {
            return false;
        } else {
            return helper(startIndex + 1, nums, target);
        }
    }
}
