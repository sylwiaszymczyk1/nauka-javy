import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class Zadanie10array {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner scanner = new Scanner(System.in);
		int[] myArray;

		System.out.print("Podaj rozmiar tabeli");
		int arraySize = scanner.nextInt();

		myArray = new int[arraySize];

		Random randomGenerator = new Random();
		for (int i=0; i<arraySize; i++) {
			myArray[i]= randomGenerator.nextInt(10000);//znajdz liczbe min i max , srednia
			System.out.println(myArray[i]);
		}
	}
		

}
