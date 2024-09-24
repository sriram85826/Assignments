package Zoho1;
import java.util.*;
public class Average {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        double[] weights = new double[10];
		        double totalWeight = 0.0;

		        System.out.println("Enter the weights of 10 students:");

		        for (int i = 0; i < weights.length; i++) {
		            System.out.print("Enter weight of student " + (i + 1) + ": ");
		            weights[i] = scanner.nextDouble();
		            totalWeight += weights[i];
		        }

		        double averageWeight = totalWeight / weights.length;
		        System.out.printf("The average weight of the 10 students is: %.2f\n", averageWeight);

		        scanner.close();
		    }
       }
