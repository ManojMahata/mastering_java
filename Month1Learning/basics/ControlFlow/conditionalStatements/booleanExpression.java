// boolean expression in conditional statements.



public class booleanExpression {

    public static void main(String[] args) {
            
        int a = 11;
        int b = 11;
        boolean isTrue = true;
        if (a == b && isTrue == true) {
            System.out.println("Yes ");
        }

        if( a<10 || isTrue == true ){
            System.out.println("yes again.");
        }

        if(isTrue){
            System.out.println("hello.");
        }


        int c = 5;
        int d = 6;
        boolean not = false;

        if (c == d || not == false) {
            System.out.println("Negative.");
        }

        if(!not) {
            System.out.println("Negativity.");
        }



    }
}