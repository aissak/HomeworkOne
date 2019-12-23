
/**
 * Class: Employee
 * 
 * @version 1.0 
 * Course: ITECH 2150 Fall 2019
 * Written: August 27, 2019
 * Purpose: Create an Employee class that calculates the grosspay of  three employees.
 *
 */
import java.util.Scanner;

public class EmployeeTester {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// array for employee
		Employee[] emp = new Employee[3];

		for (int i = 0; i < 3; i++) {

			System.out.println("Enter empolyee name ");
			String name = input.nextLine();

			// hourly rate
			System.out.println("Enter empolyee's hourly rate ");
			double hourlyRate = input.nextDouble();

			// NUMBER OF HOURS

			System.out.println("Enter number of hours worked ");
			int numberOfHours = input.nextInt();

			input.nextLine();
			// Stores information about the employees
			emp[i] = new Employee(name, hourlyRate, numberOfHours);

		}

		for (int i = 0; i < 3; i++) {

			System.out.println("Grosspay for " + emp[i].getName() + " $" + emp[i].getGrossPay());
		}
	}
}
