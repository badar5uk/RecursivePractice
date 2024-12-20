public class PowerCalculation {

    /*
    Objective: Create a recursive function to compute the value of a given base raised
     to the power of n. Both base and n are guaranteed to be 1 or more.

Requirements:

The function should be named powerN.

The input parameters are:

base: The number to be raised to the power of n.

n: The exponent.

The function must:

Return base if n = 1 (base case).

Recursively compute the result of base raised to n by multiplying base with the result of powerN(base, n - 1).

Avoid using loops.

Example Test Cases:

powerN(3, 1) → 3 (3 to the power of 1 is 3)

powerN(3, 2) → 9 (3 to the power of 2 is 9)

powerN(3, 3) → 27 (3 to the power of 3 is 27)


     */

    public static void main(String[] args) {
        System.out.println(PowerN(-2, 3));

    }

    public static Integer PowerN(Integer base, Integer exponent) {
        if (exponent == 0 && base != 0) {
            return 1;
        } else if (base == 0) {
            return 0;
        } else {
            base *= PowerN(base, exponent - 1);
        }
        return base;
    }
}
