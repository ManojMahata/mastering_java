

// there are two type of casting in java

public class TypeCasting {

     public static void main(String[] args) {

        // int a = 10;

        // double b = a;

        // System.out.println(a);
        // System.out.println(b);

        // System.out.println(a  + " " + b);


// here below c is char variable and holds 'L' now int x = c and it will print the "ASC" value of L.
        // char c = 'L';
        // int x = c;

        // System.out.println(x);



        // In upper section we learned about implicit casting 


        // Now, Explicit casting big to small

        // double d = 10.4;
        // int y = (int) d;
        // System.out.println(y);

         // here we forced to convert double data type d's value in y which is integer data type


        //int x = (int) (4.3 + 3.3);


        // type casting with char

        // char ch = 'A';
        // int a = ch;

        // System.out.println(a);

        // int value =66;

        // char letter = (char) value;

        // System.out.println(letter);

        // int v = 97;
        // char l = (char) v;
        // System.out.println(l);

        int value = 233;
        char letterOfvalue = (char) value;

        System.out.println(letterOfvalue);


     }
}