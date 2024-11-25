package Conditionals;

public class IfStatement {
    public static void main(String[] args) {

//        CONDITIONAL STATEMENTS

//        IF - ELSE

        if (true)
            System.out.println("Hi There Aliens!!");
        else
            System.out.println("Hi There Humans!!");

//        SWITCH CASE

        int checker = 1;
        String result = switch (checker) {
            case 3 -> "Hello World!!";
            case 2 -> "A Wise Man!!";
            default -> "Very Nice!!";
        };
    }
}
