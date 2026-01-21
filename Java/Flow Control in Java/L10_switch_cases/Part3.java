package L10_switch_cases;

public class Part3 {
    public static void main(String[] args) {
        //For Character:
        /*
        char x = 'B';
        switch (Character.toLowerCase(x)){
            case 'a' -> System.out.println("x is a.");
            case 'b' -> System.out.println("x is b.");
            case 'c' -> System.out.println("x is c.");
            case 'd' -> System.out.println("x is d.");
            default -> System.out.println("Other than a,b,c and d.");
        }
        */

        //For String:
        String x = "A";
        switch (x.toLowerCase()){
            case "a" -> System.out.println("x is a.");
            case "b" -> System.out.println("x is b.");
            case "c" -> System.out.println("x is c.");
            case "d" -> System.out.println("x is d.");
            default -> System.out.println("Other than a,b,c and d.");
        }
    }
}

/*
Notes:-

For characters --> Character.function_name(variable_name)
For Strings --> variable_name.function_name()
*/