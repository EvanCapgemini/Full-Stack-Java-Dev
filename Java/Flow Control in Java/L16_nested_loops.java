public class L16_nested_loops {
    public static void main(String[] args) {
        /*
        for(int i = 1; i<5; i++){
            System.out.println("");
            for(int j =1; j<=5; j++){
                System.out.print(i+":"+"="+j+"\t");
            }
            System.out.println("\n");
            System.out.println("Previous Iteration: i was "+i+".");
        }
        */

        //Assignment:
        /*
        Print Pattern:
        @
        @@
        @@@
        @@@@
        @@@@@
         */
        char p = '@';
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(p);
            }
            System.out.println();
        }
    }
}

/*
Notes:-
In a nested for loop:
* First loop --> row
* Second loop --> column
\t --> tab space.
\b --> backspace.
*/