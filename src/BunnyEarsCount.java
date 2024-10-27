public class BunnyEarsCount {

    public static void main(String[] args) {
        System.out.println("The number of bunny ears " + bunnyEars2(2));
    }

    public static Integer bunnyEars2(Integer n) {
        Integer sum = 0;
        if (n == 0) {
            return sum;
        } else if (n % 2 == 0) {
            sum += 3;
        } else {
            sum += 2;
        }
        sum += bunnyEars2(n - 1);
        return sum;
    }
}
