package LECTURE.Lecture6;

import java.util.Scanner;

//Write a program that handles adding two square matrixes of user designated size
public class MatrixAddition {
	/**Main Method*/
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//get size of square matrix
		System.out.print("please enter the size of the square matrix: ");
		int size = input.nextInt();
		//initialize matrixes
		int[][] m1 = new int[size][size];
		int[][] m2 = new int[size][size];
		int[][] sumArray = new int [size][size];

		
		//looping for first matrix rows
		for (int i = 0; i < size; i++) {
			System.out.print("Enter the next row: ");
			for(int e = 0; e < size; e++) {
				m1[i][e] = input.nextInt();
			}
		}
		
		System.out.println("Done with the first matrix. Now for the seccond one:");
		
		//looping for second matrix rows
		for (int i = 0; i < size; i++) {
			System.out.print("Enter the next row: ");
			for(int e = 0; e < size; e++) {
				m2[i][e] = input.nextInt();
				sumArray[i][e] = m1[i][e] + m2[i][e];
			}
		}
		
		System.out.println("The sum of the two matrices is: ");
		for(int i = 0; i < size; i++) {
			for(int e = 0; e < size; e++) {
				System.out.print(sumArray[i][e] + " ");
			}
			System.out.println();
		}
	}
}
