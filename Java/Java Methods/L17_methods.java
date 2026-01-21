public class L17_methods {
    public static void main(String[] args) {
        loop1();
        System.out.println("*****");
        loop2(11,20);
    }
    //Without parameters
    public static void loop1(){
        for(int i=1; i<=10; i++){
            System.out.println(i);
        }
    }
    //With parameters
    public static void loop2(int start, int stop){
        for(int i=start; i<=stop; i++){
            System.out.println(i);
        }
    }
}

/*
Notes:-

Methods:-
syntax:
public static void method_name (parameters){
...;
}
* Every java program has a main method.
* Meant for re-using codes.
To call a method --> method_name(parameters);
*/