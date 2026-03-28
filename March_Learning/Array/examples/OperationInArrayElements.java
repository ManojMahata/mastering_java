public class OperationInArrayElements {
	public static void main(String[] args) {
		// accessing array values using index positions.

		int arr[] = {1, 2, 3, 4, 5};
		System.out.println(arr[0] + " ");
		System.out.println(arr[4]);

		//update array elements

		arr[0] = 10;
		System.out.println("After updating value of array element. Here I changed value of array arr[] at index: 0, So, now the value at index 0 is: " + arr[0]);

		// traverse Array

		int number[] = {2, 4, 8, 14, 16};
		// traversing and printing array
		for ( int i = 0; i < number.length; i++)
			System.out.print(number[i] + " ");

		System.out.println();

		// to print all the values inside of array we either need for loop or something else. Right now I only know how to print array values using for loop.


		int a[] = new int[50];
		int c = a.length;
		System.out.println(c);
	}
}