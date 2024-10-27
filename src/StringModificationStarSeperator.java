import java.util.Scanner;

public class StringModificationStarSeperator {


    public static void main(String[]args){
        //Scanner userInput= new Scanner(System.in);
        //String word = userInput.nextLine();

        System.out.println(allStar("Hello"));

    }
    public static Object allStar(String str){
        StringBuilder builder = new StringBuilder();
        if(str.length() <= 1 ){
            return str;
        }
        else {
            builder.append(str.charAt(0)).append("*").append(allStar(str.substring(1)));
        }
        return builder;
    }
}
