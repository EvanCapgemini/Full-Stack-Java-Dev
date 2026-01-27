package L28_Inheritance.Part5_types;

import L28_Inheritance.Part5_types.animals.reptile.Crocodile;

public class Main {
    public static void main(String[] args) {
        Crocodile croc = new Crocodile(20,100, "semi-aquatic", "O+", true, "soft shelled", "Fresh Waters", "Asia");
        System.out.println("Information about Crocodiles:-");
        System.out.println(croc);
    }
}

/*
Notes:-

Types of inheritance:-
* Single Level --> Inherits only from a single class.
* Multi-Level --> Say, we have class A, B and C. class C inherits from class B and class B inherits from class A.
* Hierarchical Level --> All child classes inherits from parent class.
* No Multiple inheritance in Java.
 */
