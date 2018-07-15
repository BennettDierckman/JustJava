package LECTURE.Lecture6;

import java.util.Scanner;

//get length of array
//get values for array
//display origional array
//display sorted array
//display average of the array
public class ArrayPractice {
	/**Main Method*/
	public static void main(String[] args) {
		//create scanner object
		Scanner input = new Scanner(System.in);
		
		//get array length
		System.out.print("How long is this array gonna be... : ");
		int length = input.nextInt();
		int[] numList = new int[length];
		
		//fill arrays
		System.out.print("Enter the " +length+ " values: ");
		for (int i = 0 ; i < length; i++) {
			numList[i] = input.nextInt();
		}
		
		//copy the list then sort the copy
		int[] listCopy = new int[length];
		System.arraycopy(numList, 0, listCopy, 0, numList.length);
		java.util.Arrays.sort(listCopy);

		
		//display shite
		System.out.print("The OG array: ");
		int total = 0;
		for (int e : numList) {
			System.out.print( e + " ");
			total += e;
		}
		System.out.println();
		System.out.print("The sorted array: ");
		for (int e : listCopy)
			System.out.print( e + " ");
		System.out.println();
		
		System.out.printf("The average of the array: %4.2f", (double)total / length);
	}

}
