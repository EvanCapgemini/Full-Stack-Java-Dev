public class L18_return_in_methods {
    public static void main(String[] args) {
        int area = areaOfRectangle(5,4);
        System.out.println("Area of rectangle : "+area);
    }
    public static int areaOfRectangle(int l, int b){
        //System.out.println("Rectangle length:"+l+" and breadth:"+b+" has an area of "+l*b);
        return l*b;
    }
}

/*
Notes:-

When using methods, it is always good practice to return values, rather than print messages.
void --> method returns nothing.
*/
