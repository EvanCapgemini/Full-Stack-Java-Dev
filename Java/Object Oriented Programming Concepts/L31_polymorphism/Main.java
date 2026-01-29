package L31_polymorphism;

import L31_polymorphism.phone.Iphone;
import L31_polymorphism.phone.Nokia;
import L31_polymorphism.phone.Phone;

public class Main {
    public static void main(String[] args) {
        /*
        Phone p = new Phone();
        p.feature();
        Nokia n = new Nokia();
        n.feature();
        Iphone ip = new Iphone();
        ip.feature();
        */

        //Initializing a generic reference.
        Phone p;
        p = new Nokia(); //Now it can take multiple forms.
        p.feature();
    }
}

/*
Notes:-

Poly --> multiple
morphism --> forms

The base class (Parent class), can take multiple forms (child classes).
*/