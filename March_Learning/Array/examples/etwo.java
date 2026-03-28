public class etwo {

    public static void main(String[] args){
        
        //primitive array
        int[] arr = {1, 2, 3, 4};
        int n = arr.length;
        System.out.println("\n" + n);

        System.out.print("Primitive Array --> ");

        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");


        System.out.println();

        String[] name = {"Manoj", "Mahata", "Kathmandu"};
        // n = name.length;
        System.out.println(n);

        System.out.print("Non-Primitive Array --> ");
        for ( int i = 0; i < name.length; i ++)
            System.out.print(name[i] + " ");

    }
}