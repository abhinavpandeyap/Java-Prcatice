/**
 * 
 */
package com.app.org;

/**
 * @author AbhinavPandey
 *
 */
public class Mgr extends Emp {
	
double perfBonus;

public Mgr(String firstName, String lastName, double basic, int deptId) {
	super(firstName, lastName, basic, deptId);
	
}

	@Override
	public double computeNetSalary() {
				return (this.getBasic()+this.perfBonus);
	}
	public double getPerfBonus() {
		return perfBonus;
	}
	public void setPerfBonus(double perfBonus) {
		this.perfBonus = perfBonus;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Manager Details -"+super.toString();
	}
	
	

}
