import com.sun.jdi.Value;

public class LargestSubstringStartingEnding {

    /*
    Objective: Create a recursive function that computes the length of the largest substring in a given string that starts and ends with a specified non-empty substring sub.

Requirements:

The function should be named strDist.

The input parameters are:

str: The string in which to search for the largest substring.

sub: The non-empty substring that the largest substring must start and end with.

The function must:

Return 0 if the string does not contain sub.

Recursively trim characters from the beginning and/or end of the string until the largest substring that starts and ends with sub is found.

Return the length of the resulting substring.

Avoid using loops.

Example Test Cases:

strDist("catcowcat", "cat") → 9 (The entire string starts and ends with "cat")

strDist("catcowcat", "cow") → 3 (Substring "cow" starts and ends with "cow")

strDist("cccatcowcatxx", "cat") → 9 (The substring "catcowcat" starts and ends with "cat")


     */

    public static void main(String[] args) {
        Integer resultString = strDist("ccccatcowcatxx", "cow");
        System.out.println(resultString);
    }

    public static Integer strDist(String str, String sub) {
        Integer length =  str.length();
        if (!(str.length() >= sub.length()) && !str.contains(sub)) {
            return length;
        }
        if (str.startsWith(sub) && str.endsWith(sub)) {
            return str.length();
        } else if (str.length() == sub.length() && !str.equals(sub)) {
            return 0;
        } else if (!str.startsWith(sub)) {
            System.out.println("Removed from left side: " + str.charAt(0));
            length = strDist(str.substring(1), sub);
        } else if (!str.endsWith(sub)) {
            System.out.println("Removed from right side: " + str.charAt(str.length() - 1));
            length = strDist(str.substring(0, str.length() - 1), sub);
        }
        return length;
    }
}
