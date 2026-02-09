public class dryRun {

    public static void main(String[] args) {
        
        int x = 10;

        if (x > 5) {
            System.out.println("A");
            // here program stops checking further statements.
        } else if(x < 11) {
            System.out.println("B");
        }


    }
}