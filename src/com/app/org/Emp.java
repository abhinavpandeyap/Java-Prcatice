package com.app.org;

public abstract class Emp{
	public int empId,deptId; 
	public static int idGenerator,deptIdGenerator;
	public String firstName,lastName;
	public double basic,salInc;
	static {
		idGenerator=1000;
	}
	
	//Setters
	public static void setId(int id) {
		idGenerator=id;
	}
	public static void setDepartmentId(int deptId) {
		deptIdGenerator=deptId;
	}
	public void setBasic(double basic) {
		this.basic = basic;
		}
	//Getters
	
	   public double getBasic() {
		return basic;
		}
		
		public String getFirstname() {
		return firstName;
		}
		public String getLastname() {
		return lastName;
		}
	
	//Constructor

	public Emp(String firstName,String lastName,double basic,int deptId) {
		super();
		this.firstName=firstName;
		this.lastName=lastName;
		this.basic=basic;
		empId=idGenerator;
		this.deptId=deptId;
		idGenerator++;
	}
 
 
 @Override
 public String toString(){
	 return "First Name-"+firstName+" Last Name-"+lastName+" Emp ID-"+empId+" Department ID-"+deptId+" Basic Salary-"+basic;
	 
 }
 
 public abstract double computeNetSalary();
 public double updateSalary(double salInc) {
	 return this.getBasic()+salInc;
	 
 }
}
