public class L20_codeBlock_indentation_and_statements {
    //Indentation showing code block for main method.
    public static void main(String[] args) {
        //Is a code block.
        //Indentation for showing code block of for loop.
        for(int i=1; i<=5; i++){
            System.out.println(i);
        }
        //Is not a code block.
        {
            System.out.println("Hello World"); //statement e.g.
        }
    }
}

/*
Notes:-

Code Block:
Anything with {...} and which serves some purpose.

Statement:
A single line of code that has a purpose and is complete.

Indentation:
Spaces for showing alignment with a particular scope or code block.
*/