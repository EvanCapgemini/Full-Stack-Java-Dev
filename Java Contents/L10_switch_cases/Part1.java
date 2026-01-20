package L10_switch_cases;

public class Part1 {
    public static void main(String[] args) {
        int x = 4;
        switch (x){
            case 1:
                System.out.println("x is 1.");
                break;
            case 2:
                System.out.println("x is 2.");
                break;
            case 3:
                System.out.println("x is 3.");
                break;
            case 4:
                System.out.println("x is 4.");
                break;
            default:
                System.out.println("Other than 1,2,3 and 4.");
                break;
        }
    }
}

/*
Notes:-

Switch Case:-
syntax:
Initialize;
switch(variable_name){
    case value1(w.r.t data-type of variable){
        ...; //Executes if the value represented as case is same as value passed in parentheses.
    }
    case value n{...;}
    default:{...;}
}
break keyword --> Used when case/default is satisfied and, you want to prevent it from iterating through other cases.
No need for break for default case, but it is good practice to use.
*/
