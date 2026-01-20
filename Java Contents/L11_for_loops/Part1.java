package L11_for_loops;

public class Part1 {
    public static void main(String[] args) {
        /*
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        */

        //Reverse:
        for(int i = 10; i>0; i--){
            System.out.println(i);
        }
    }
}

/*
Notes:-

Escape Sequence:
\n --> new line.
System.out.println() --> output on a new line.
System.out.print() --> output on same line.

For Loops:-
syntax:
for(initialization; condition; increment/decrement){
...; //As long as condition true, it will execute.
}
*/