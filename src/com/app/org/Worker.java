/**
 * 
 */
package com.app.org;

/**
 * @author AbhinavPandey
 *
 */
public class Worker extends Emp {
	double hourlyRate;
	int hoursWorked;

	/**
	 * @param firstName
	 * @param lastName
	 * @param basic
	 */
//	public Worker(String firstName, String lastName, double basic,double hourlyrate) {
//		
//		this.hourlyRate=hourlyrate;
//		// TODO Auto-generated constructor stub
//	}

	public Worker(String firstName, String lastName, double basic, int deptId) {
		super(firstName, lastName, basic, deptId);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Worker Details- "+super.toString();
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	@Override
	public double computeNetSalary() {
		return (this.getBasic()+(this.hourlyRate*this.hoursWorked));
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}


}
