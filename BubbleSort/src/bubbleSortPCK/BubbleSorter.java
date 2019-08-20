package bubbleSortPCK;
import java.util.Arrays;
import java.util.Scanner;
public class BubbleSorter {
	public static void main(String[] args) {
		takeInputs();
		
	}
	static void takeInputs() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the total number of item");
		int itemNum = input.nextInt();
		int[] numbers = new int[itemNum];
		for(int i = 0; i<itemNum; i++) {
			System.out.printf("%s%2d%s", "Enter the ", (i+1), "th number");
			numbers[i] = input.nextInt();
		}
		System.out.println("The sequence you enter: \n " +Arrays.toString(numbers));
		BubbleSort(numbers);
	}
	static void BubbleSort(int[] arr) {
		for(int l=0; l<arr.length-1; l++) {
			for(int i = 0; i<arr.length-1; i++) {
				int tempMax = Math.max(arr[i], arr[i+1]);
				int tempMin = Math.min(arr[i], arr[i+1]);
				arr[i+1] = tempMax; arr[i] = tempMin;
			}
		}
		printResultant(arr);
	}
	static void printResultant(int[] arr) {
		System.out.println("The resultant sequence is: \n"+Arrays.toString(arr));
	}

}
