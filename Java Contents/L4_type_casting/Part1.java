package L4_type_casting;

public class Part1 {
    public static void main(String[] args) {
        //For Explicit type casting.
        short a = 10;
        byte b = (byte)(a);
        System.out.println(b);
        //For Implicit type casting.
        byte c = 20;
        short d = c;
        System.out.println(d);
    }
}

/*
Notes:-
1 byte = 8 bit.
* Implicit Casting:(Widening) --> Works normally. E.g. --> short to int

* Explicit Casting: (Narrowing) --> Will throw an error normally. E.g. --> short to byte
Here, syntax is data-type = (data-type) value.
*/