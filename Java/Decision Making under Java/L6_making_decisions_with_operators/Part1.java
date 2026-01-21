package L6_making_decisions_with_operators;

public class Part1 {
    public static void main(String[] args) {
        int num1 = 10;
        //If condition:
        //Without {...}
        if(num1!=10)
            System.out.println("Hello World!");
        System.out.println("Welcome!");
        //With {...}
        if(num1==10){
            System.out.println("Hello World!");
            System.out.println("Welcome!");
        }

        //If-else Condition:
        int num2 = 6;
        if(num2>7){
            System.out.println("Greater than 7");
        }
        else{
            System.out.println("Less than 7 or maybe be equal to it.");
        }
    }
}

/*
Notes:-

if condition:
* When no {} used then scope of if --> Only for one statement.
* To override above, we make use of {} --> For multiple statements.
syntax:
if(condition){
...; //Only if true, the code in this block will run.
}

Comparison:
== --> equal to
!- --> not equal to

if-else condition:
if(condition){
...; //Executes if true.
}
else{
...; //Executes if false.
}
*/