public class L9_making_decision_with_elseif {
    public static void main(String[] args) {
        int y = 7;
        if(y>7){
            System.out.println("Greater.");
        }
        else if(y<7){
            System.out.println("Lesser.");
        }
        else{
            System.out.println("Equal!");
            if(y==7){
                System.out.println("Valid.");
            }
            else{
                System.out.println("Invalid.");
            }
        }
    }
}

/*
Notes:-

Else-If statement:
syntax:
if(condition){
...; //Executes if true.
}
else if(condition){
...; //Executes if true.
}
else{
...; //Executes if false.
}

* Nested if/if-else/else if statements are supported.
*/