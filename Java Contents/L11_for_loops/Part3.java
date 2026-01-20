package L11_for_loops;

public class Part3 {
    public static void main(String[] args) {
        //Value re-assigned.
        int i = 0;
        for(i=1; i<=5; i++){
            System.out.println(i);
        }
        System.out.println(i); // That is why this prints 11.
    }
}

/*
Notes:-

The increment/decrement only happens after a complete iteration.
*/