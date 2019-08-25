package a1;

import java.util.Scanner;
import java.text.DecimalFormat; 

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num_customers = scan.nextInt();
		String [] customer_names = new String[num_customers];
	    double [] total_prices = new double[num_customers];
	    
		for (int i=0; i<num_customers; i++) {
			String customer_first_name = scan.next();
			String customer_last_name = scan.next();
			String customer_name = customer_first_name.substring(0,1)+". "+customer_last_name;
			customer_names[i] = customer_name;
			int num_fruits = scan.nextInt();
//			System.out.println(num_fruits);
			double total_price = 0;
			for (int j=0; j<num_fruits; j++) {
				int quantity = scan.nextInt();
				String name = scan.next();
				double price = scan.nextDouble();
				total_price += quantity * price;
			}
			total_prices[i]=total_price;
		}
		
		for (int i=0; i<num_customers; i++) {
			System.out.println(customer_names[i] + ": " + round(total_prices[i]));
		}
		
	}
	static String round(double number) {
		DecimalFormat df = new DecimalFormat("#.00");
		return df.format(number);
//		return Math.round(number*100.0)/100.0;
		
	}	
}
