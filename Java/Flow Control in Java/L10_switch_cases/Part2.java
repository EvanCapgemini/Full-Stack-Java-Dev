package L10_switch_cases;

public class Part2 {
    public static void main(String[] args) {
        //Enhanced switch statements:
        char x = 'c';
        switch (x) {
            case 'a' -> System.out.println("x is a.");
            case 'b' -> System.out.println("x is b.");
            case 'c' -> System.out.println("x is c.");
            case 'd' -> System.out.println("x is d.");
            default -> System.out.println("Other than a,b,c and d.");
        }

    }
}

/*
Notes:-

Switch cases can only be used with:
* int
* String
* char
*/