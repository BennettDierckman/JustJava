package LECTURE.Lecture6;

import java.util.Arrays;

//TOGGLE COMMENTED SECTIONS FOR DANK CODE
public class ArraySort_n_Search {
	
	/**Sorting an Array*/
//	public static void main(String[] args) {
//		double[] numList = new double[10];
//
//		//fill the array with random numbers
//		for (int i = 0; i < numList.length; i++) {
//			numList[i] = Math.random() * 100;
//		}
//		
//		//Sort the array from smallest to largest
//		java.util.Arrays.sort(numList);
//		
//		//output the sorted values
//		for (double e: numList) {
//			System.out.printf("%4.2f\n", e);
//		}
//	}
	
	/**Searching an Array*/
	public static void main(String[] args) {
		int[] numList = new int[5];

		//fill the array with random numbers
		for (int i = 0; i < numList.length; i++) {
			numList[i] = (int) (Math.random() * 20);
		}
		
		//Sort the array from smallest to largest
		java.util.Arrays.sort(numList);
		
		//binarySearch returns an index number if the target is found
		//and a negative number otherwise
		if(java.util.Arrays.binarySearch(numList, 10) >= 0)
			System.out.println("10 is in the list!\n");
		else
			System.out.println("10 is not in the list!\n");
		
		//output the sorted values
		for (int e: numList) {
			System.out.println(e);
		}
	}

}
