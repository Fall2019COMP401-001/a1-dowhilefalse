package a1;

import java.util.Scanner;
import java.text.DecimalFormat; 

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num_fruits = scan.nextInt();
		String [] all_fruits = new String[num_fruits];
		double [] all_prices = new double[num_fruits];
		
		for (int i=0; i<num_fruits; i++) {
			all_fruits[i] = scan.next();
			all_prices[i] = scan.nextDouble();
			}
		
		int num_customers = scan.nextInt();
		String [] customer_names = new String[num_customers];
		double [] customer_total_prices = new double[num_customers];
		
		for (int i=0; i<num_customers; i++) {
			String first_name = scan.next();
			String last_name = scan.next();
			customer_names[i] = first_name + " " + last_name;
			int per_num_fruits = scan.nextInt();
			double total_prices = 0;
			for (int j=0; j<per_num_fruits; j++) {
				int num_fruits_buy = scan.nextInt();
				String fruits_buy = scan.next();
				int temp_index = returnIndex(all_fruits, fruits_buy);
				total_prices += all_prices[temp_index] * num_fruits_buy;
			}
			customer_total_prices[i] = total_prices;
		}
		
		int index_largest = findValueMax(customer_total_prices);
		int index_smallest = findValueMin(customer_total_prices);
		System.out.println("Biggest: " + customer_names[index_largest] + " (" + round(customer_total_prices[index_largest])+")");
		System.out.println("Smallest: " + customer_names[index_smallest] + " (" + round(customer_total_prices[index_smallest])+")");
		System.out.println("Average: " + round(calculateValueMean(customer_total_prices)));
		}

		// Your code follows here.
	static String round(double number) {
		DecimalFormat df = new DecimalFormat("0.00");
		return df.format(number);
//		return Math.round(number*100.0)/100.0;
	}	
	
	static int returnIndex(String[] all_fruits, String fruits_buy) {

		for (int i=0; i < all_fruits.length; i++) {
			if (all_fruits[i].equals(fruits_buy)) {
				return i;
			}
		}
		return 0;
	}
	
	static int findValueMin(double[] vals) {
		
		// Initialize current minimum to first value in array.
		double cur_min = vals[0];
		int cur_min_index = 0;
		// Starting with second value (if any), compare each value
		// in array with current minimum and replace if smaller.
		
		for (int i=1; i<vals.length; i++) {
			if (vals[i] < cur_min) {
				cur_min = vals[i];
				cur_min_index = i;
			}
		}
		
		return cur_min_index;
	}

	static int findValueMax(double[] vals) {
		
		// Initialize current minimum to first value in array.
		double cur_max = vals[0];
		int cur_max_index = 0;
		// Starting with second value (if any), compare each value
		// in array with current minimum and replace if smaller.
		
		for (int i=1; i<vals.length; i++) {
			if (vals[i] > cur_max) {
				cur_max = vals[i];
				cur_max_index = i;
			}
		}
		return cur_max_index;
	}
	
	static double calculateValueMean(double[] vals) {
		
		double sum = 0;
		
		for (int i=0; i<vals.length; i++) {
			sum += vals[i];
		}
		double mean = sum / vals.length;
		return mean;
	}


}
