public class L7_ternary_operator {
    public static void main(String[] args) {
        int x = 4;
        String result = (x>=5)?"x is greater than or equal to 5.":"x is less than 5.";
        System.out.println(result);
    }
}

/*
Notes:-

Unary operators --> ++, --, !
Binary operators --> +, -, *, /, %, &&, ||
Ternary operator: (syntax)
data-type variable_name = (condition) ? statement1 : statement2;
here, statement1 --> executes if true
      statement2 --> executes if false
*/