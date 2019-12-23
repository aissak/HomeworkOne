/**
 * Class: Employee
 * 
 
 * @version 1.0 Course: ITECH 2150 Fall 2019 Written: August 27, 2019 Purpose:
 *          Create an Employee class that calculates the grosspay of three
 *          employees.
 *
 */
public class Employee {
	private String name;
	private double hourlyRate;
	private int numberOfHours;

	/**
	 * Method: Employee default constructor
	 * 
	 * @param name, hourlyRate, numberOfHours.
	 * 
	 * 
	 */

	public Employee() {
		name = "";
		hourlyRate = 0;
		numberOfHours = 0;
	}

	/**
	 * @return inputs the name, the hourly rate, and the number of hours
	 * 
	 */

	public Employee(String inputName, double inputHourlyRate, int inputNumberOfHours) {

		name = inputName;
		hourlyRate = inputHourlyRate;
		numberOfHours = inputNumberOfHours;
	}

	/**
	 * @return the grossPay
	 * @return calculates the hours an employee worked
	 */
	public double getGrossPay() {

		if (numberOfHours <= 40) {

			return numberOfHours * hourlyRate;
		} else {
			return (hourlyRate * 40) + (numberOfHours - 40) * (hourlyRate * 1.5);
		}

	}

	/**
	 * Getter: gets the name
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter: stores the name
	 * 
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the hourlyRate
	 */
	public double getHourlyRate() {
		return hourlyRate;
	}

	/**
	 * Setter: stores the hourlyRate
	 * 
	 * @param hourlyRate2 the hourlyRate to set
	 */
	public void setHourlyRate(double hourlyRate2) {
		this.hourlyRate = hourlyRate2;
	}

	/**
	 * Getter: gets the number of hours
	 * 
	 * @return the numberOfHours
	 */
	public int getNumberOfHours() {
		return numberOfHours;
	}

	/**
	 * Setter: stes the number of hours
	 * 
	 * @param numberOfHours the numberOfHours to set
	 */
	public void setNumberOfHours(int numberOfHours) {
		this.numberOfHours = numberOfHours;
	}

}
