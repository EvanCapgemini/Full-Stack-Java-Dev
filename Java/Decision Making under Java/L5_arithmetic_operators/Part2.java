package L5_arithmetic_operators;

public class Part2 {
    public static void main(String[] args) {
        int num1 = 15%4;
        System.out.println(num1);
        int num2 = 2;
        int num3 = 3;
        //Prefix:
        System.out.println(++num2);
        System.out.println(num2);
        //Suffix:
        System.out.println(num3++);
        System.out.println(num3);
    }
}

/*
Notes:-

% --> remainder.
++/-- --> increases/decreases value by 1
*/