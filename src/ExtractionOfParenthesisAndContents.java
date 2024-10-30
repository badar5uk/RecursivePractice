public class ExtractionOfParenthesisAndContents {

    public static void main(String[] args) {
        System.out.println(parenBit("jdfj(Hello) hdghf"));

    }

    public static String parenBit(String str) {

        if (str.charAt(0) != '(') {
            str = parenBit(str.substring(1));
        } else if (str.charAt(str.length() - 1) != ')') {
            str = parenBit(str.substring(0, str.length() - 1));
        }
        return str;

    }
}

