package a1;

import java.util.Scanner;

public class A1Novice {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Read in count of numbers to process
		
		int count = scan.nextInt();
		
		
		// Create an array to store numbers.
		
		int[] values = new int[count];
		
		
		// Read values into the array
		
		for (int i=0; i<values.length; i++) {
			values[i] = scan.nextInt();
		}
		
		// All input parsed, so close scanner
		scan.close();
		
		// Use helper functions to calculate sum, min, and max
		
		int sum = calculateValueSum(values);
		int min = findValueMin(values);
		int max = findValueMax(values);
		
		// Print results
		
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
		System.out.println("Average: " + String.format("%.2f", ((double) sum) / ((double) count)));
		
	}

	
	static int calculateValueSum(int[] vals) {
		
		int sum = 0;
		
		for (int i=0; i<vals.length; i++) {
			sum += vals[i];
		}
		
		return sum;
	}

	static int findValueMin(int[] vals) {
		
		// Initialize current minimum to first value in array.
		int cur_min = vals[0];
		
		// Starting with second value (if any), compare each value
		// in array with current minimum and replace if smaller.
		
		for (int i=1; i < vals.length; i++) {
			if (vals[i] < cur_min) {
				cur_min = vals[i];
			}
		}
		
		return cur_min;
	}


	static int findValueMax(int[] vals) {
		
		// Initialize current minimum to first value in array.
		int cur_max = vals[0];
		
		// Starting with second value (if any), compare each value
		// in array with current minimum and replace if smaller.
		
		for (int i=1; i < vals.length; i++) {
			if (vals[i] > cur_max) {
				cur_max = vals[i];
			}
		}
		
		return cur_max;
	}
}
