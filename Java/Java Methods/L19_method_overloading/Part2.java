package L19_method_overloading;

public class Part2 {
    public static void main(String[] args) {
        sum(1,2);
        sum(3.14,3);
        sum(4,5.25);
    }
    public static void sum(int num1, int num2){
        System.out.println("Addition of 2 integers.");
    }
    public static void sum(int num1, double num2){
        System.out.println("Addition of 1 integer and 1 double.");
    }
    public static void sum(double num1, int num2){
        System.out.println("Addition of 1 double and 1 integer.");
    }
}

/*
Notes:-

N.A
*/
