package L2_primitive_datatypes;

public class T2_floating_points {
    public static void main(String[] args) {
        float decinum1 = 3.14f;
        double decinum2 = 3.1412345d;
        double ans = decinum1 + decinum2;
        System.out.println(ans);

        //Implicit type-casting (Automatically done by Java)
        int num = 1/2;
        System.out.println(num); //int
        System.out.println(1/2); //int (since both values are int)
        System.out.println(1/2f); //float
    }
}

/*
Notes:-

Floating points:
* Used to store decimal values.
* For precise value display/calculation never use this data-type, java provides some kind of class for this.
* By default, all decimal values are identified as double.
Memory taken:
1. float --> 4 bytes (value is followed by f)
2. double --> 8 bytes (value is followed by d)

Understanding representation:
say, 3.14e + 10 --> means 3.14 * 10^10
similarly, 3.14e - 10 --> 3.14 * 10^(-10)
*/