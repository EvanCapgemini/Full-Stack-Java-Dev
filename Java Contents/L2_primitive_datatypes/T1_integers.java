package L2_primitive_datatypes;

public class T1_integers {
    public static void main(String[] args) {
        int num1 = 1000;
        short num2 = 7;
        long num3 = 1000000L;
        long ans =  num1 + num2+ num3;
        System.out.println(ans);
    }
}

/*
Notes:-

Integers:
* Can store only whole numbers.
Memory taken:
1. int --> 4 bytes
2. short --> 2 bytes
3. long --> 8 bytes (value is followed by L)
4. byte (range) --> -128 to 127. 1 byte
 */