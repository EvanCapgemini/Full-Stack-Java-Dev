package L6_making_decisions_with_operators;

public class Part3 {
    public static void main(String[] args) {
        boolean x = false;
        boolean y = false;
        //AND
        if(x && y){
            System.out.println("Condition is true.");
        }
        else{
            System.out.println("False condition.");
        }
        //OR
        if(x || y){
            System.out.println("Condition is true.");
        }
        else{
            System.out.println("False condition.");
        }
    }
}

/*
Notes:-

Logical:
&& --> AND operator. (Both need to be true, in-order to return true)
|| --> OR operator. (If Both false, only then will it return false)
*/