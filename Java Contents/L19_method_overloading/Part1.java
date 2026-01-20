package L19_method_overloading;

public class Part1 {
    public static void main(String[] args) {
        //System.out.println("Sum="+add(1,2));
        System.out.println("Area of shape = "+area(2,3));
        System.out.println("Area of shape = "+area(2));
    }
    public static int add(int num1, int num2){
        return num1+num2;
    }
    public static int area(int l, int b){
        return l*b;
    }
    public static int area(int s){
        return s*s;
    }
}

/*
Notes:

Method overloading:-
* If you have  another method that has same name and well as same parameters, it will throw an error.
* But, if you have another method that has the same name but different parameters, it won't throw an error.
Rules:-
parameters should either be more/less in number OR if they are the same then their data-type should be different OR different name w.r.t the other method with whom it shares a name with.
*/
