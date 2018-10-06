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
		int min = 0;
		int max = 0;
		int sum = 0;
		int average = 0;
		for (int i = 0; i < arraySize; i++) {
			myArray[i] = randomGenerator.nextInt(10000);// znajdz liczbe min i max , srednia
			if (i == 0) {
				min = myArray[i];
				max = myArray[i];
			}
			if (myArray[i] < min) {
				min = myArray[i];
			}
			if (myArray[i] > max) {
				max = myArray[i];
			}

			sum += myArray[i];
			
			average=sum/arraySize;
			
			System.out.println(myArray[i] + " Wartosc minimalna to " + min + " Wartosc maksymalna to " + max);
			
		}
		System.out.println("Suma elementow tablicy wynosi " + sum);
		System.out.println("Srednia elementów tablicy wynosi " + average);

	}

}
