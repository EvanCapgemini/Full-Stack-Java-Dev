public class L14_break_and_continue {
    public static void main(String[] args) {
        //break:
        for(int i = 0; i<5; i++){
            System.out.println(i);
            if(i==3){
                break;
            }
        }
        System.out.println("On using continue keyword,");
        //continue:
        for(int i = 0; i<5; i++){
            System.out.println(i);
            if(i==3){
                continue;
            }
        }
    }
}

/*
Notes:-
* break and continue keywords can only be used in switch/loops.
break --> used to terminate an iteration when condition is true.
continue --> proceeds to iterate even if true condition achieved.
*/
