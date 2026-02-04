import java.sql.Savepoint;
import java.util.function.BooleanSupplier;

public class LogicalOprator {

    public static void main(String[] args){

        // Logical operators are used to perform logical operation like "AND" or "OR", same as digital logic gates.

        // logical operatiron: 
        boolean x = true;
        boolean y = false;

        System.out.println(" x && y : " + ( x && y));
        System.out.println(" x != y: " + ( x != y));

        System.out.println(" x || y : " + ( x || y));

        System.out.println( " !x : " + ( !x ));

        System.out.println( " !y : " + ( !y ));

    }
}