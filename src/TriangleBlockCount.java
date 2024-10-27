public class TriangleBlockCount {
    /*
    Input: Number of rows in a triangle
    Output: number of blocks in the triangle
    Process: - using recursive method, the triangle is split into blocks
             - each row will contain a smaller amount of blocks than the previous
             - if the triangle 10 rows, it subtracts it and adds the number each time
             - use a recursive function to check n
             - if n is greater than 0 then it adds the number to the function and subtracts 1
             - blocks = n + triangle( n-1)

     */

    public static void main(String[]args){
        System.out.println("The number of blocks are: " +triangle(2));

    }
    public static Integer triangle(Integer n){
        Integer sum =0;
        if(n == 0){
            return 0;
        }else {
            sum = n + triangle(n-1);
        }
        return sum;
    }
}
