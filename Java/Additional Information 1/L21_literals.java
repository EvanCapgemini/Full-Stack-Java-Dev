public class L21_literals {
    public static void main(String[] args) {
        String word = null;
        boolean fact = true;
        System.out.println(word + "\n" + fact);
        System.out.println("\\Hello\\ World!");
        int x = 0100;
        int y = 0x64;
        System.out.println(x);
        System.out.println(y);
    }
}

/*
Notes:-

null and true/false are literals. (special)
\n, \t are character literals.
To include special characters like say ' or " in output  --> try using \' or \" respectively.
0 as prefix to a number --> base 8 (octal notation).
0x --> hexadecimal
0b --> binary
*/
