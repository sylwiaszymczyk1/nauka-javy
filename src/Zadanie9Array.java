
public class Zadanie9Array {

	public static void main(String[] args) {

		int[] myArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		// wyswietlenie pierwszej tabeli
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i] + " ");
		}
		// zrobienie drugiej tabeli
		int[] myArray2 = new int[10];
		for (int i = 9; i >= 0; i--) {
			myArray2[i] = 9 - i;

		}
		int[] myArray3 = new int[10];
		for (int i = 0; i < myArray3.length; i++) {
			myArray3[i] = myArray[i] + myArray2[i];

		}

		// wyswietlenia drugiej tabeli
		printArray(myArray2);

		// wyswietlenie trzeciej tabeli
		printArray(myArray3);
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Element " + (i+1) +": " + array[i]);

		}
	}

}
