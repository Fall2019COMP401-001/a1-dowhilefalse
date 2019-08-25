package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num_fruits = scan.nextInt();
		String [] all_fruits = new String[num_fruits];
		double [] all_prices = new double[num_fruits];
		
		int [] customer_count = new int[num_fruits];
		int [] customer_fruits_count = new int[num_fruits];
		
		for (int i=0; i<num_fruits; i++) {
			all_fruits[i] = scan.next();
			all_prices[i] = scan.nextDouble();
			}
		
		int num_customers = scan.nextInt();
		
		for (int i=0; i<num_customers; i++) {
			String first_name = scan.next();
			String last_name = scan.next();
			int per_num_fruits = scan.nextInt();
			int [] temp_count = new int[num_fruits];
			for (int j=0; j<per_num_fruits; j++) {
				int num_fruits_buy = scan.nextInt();
				String fruits_buy = scan.next();
				
				int temp_index = returnIndex(all_fruits, fruits_buy);
				temp_count[temp_index] = 1;
				customer_fruits_count[temp_index] += num_fruits_buy;
				
			}
		    for (int k=0; k<customer_count.length; k++) {
		    	customer_count[k] += temp_count[k];
		    }
			
		}
			
		for (int i=0; i<num_fruits; i++) {
			if (customer_count[i] == 0) {
				System.out.println("No customers bought " + all_fruits[i]);
				}
			else {
				System.out.println(customer_count[i] + " customers bought " + customer_fruits_count[i]+ " "+ all_fruits[i]);
				}
		}
	
		}

		// Your code follows here.
		
	
	static int returnIndex(String[] all_fruits, String fruits_buy) {

		for (int i=0; i < all_fruits.length; i++) {
			if (all_fruits[i].equals(fruits_buy)) {
				return i;
			}
		}
		return 0;
	}
	

}
