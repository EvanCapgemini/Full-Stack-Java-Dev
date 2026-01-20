public class L15_foreach {
    public static void main(String[] args) {
        int[] z = {1,2,3,4,5};
        System.out.println(z[1]);
        for(int temp : z){
            System.out.print(temp);
        }
    }
}

/*
Notes:-

Arrays:-
Initialization:
data-type[] variable_name = {values};
Index --> starts from 0.
Stored value usage --> variable_name[index]

For Each:-
syntax:
for(data-type variable_name : array_name){
...;
}
*/