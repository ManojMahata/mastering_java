public class Ternary {

    public static void main(String[] args) {

        // ternary operator is shorthand version of the if-else statement. It has three operands and hence the name ternary.

        // Ternary: Having three units or components or elements.

        int a = 10, b = 5, c = 15, result;

        // here result holds max og three number;
        // numbers


        // Varaible = (condition) ? expressionIfTrue : expressionIfFale;

        result = ( ( a > b) ? ( a > c ) ?  a : c : ( b > c ) ? b : c );
        System.out.println("The max of three numbers : " + result);


    }
}