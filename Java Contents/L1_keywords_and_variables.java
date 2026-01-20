public class L1_keywords_and_variables {
    public static void main(String[] args) {
        int value1 = 10;
        int value2, value3, ans;
        value2 = value1*2;
        value3 = value1*3;
        ans = value1 + value2 + value3;
        System.out.println(value1);
        System.out.println(ans);
    }
}

/*
Notes:-

Keywords:
* Reserved words that are known to the compiler.
* Can't be used as a name for a variable.
* Case-sensitive.
* true, false and const --> literals (Also reserved words).
    ~ literals are values assigned to a variables (identifiers).
    ~ keywords have some meaning behind their use.
* goto and const --> deprecated.

Variable:
* Also known as identifiers.
* Could say they are names given to a space in memory that stores the data (values/literals).
* All variables have a type (data-type).

Initialising variables:
Method 1: Initialisation
syntax --> data-type variable_name = value;
OR
Method 2:
data-type variable_name; Declaration
variable_name = value; Assignment

Kinds of variables:
1. Instance variable --> Each object has its own value. It is non-static.
E.g.
int age;
boy1 : age = 19
boy2 : age = 18
2. Class variable --> Value shared across all objects. It is static.
E.g.
Total boys in a classroom.
3. Local variable --> Variables that temporarily store values and have their scope within {...}.
4. Parameters --> Variables that hold value/values within () used for that particular method.
*/
