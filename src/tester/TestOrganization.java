package tester;

import com.app.org.*;
import com.app.org.Worker;
import com.app.org.Mgr;
import java.util.Scanner;

public class TestOrganization {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println(" -----------------Employee Management App--------------");
			System.out.println(" -------------------------------------------------------");
			int countEmp = 0;
			System.out.println("Enter the limit of the employees in the Organiztaion ");
			int limit = sc.nextInt();
			Emp[] emp = new Emp[limit];
			int choice;
			do {
				System.out.println(
						"Enter your Choice :\n1. Hire Manager \n2. Hire Worker \n3. Display info of all Employees \n4. Update Salary \n10. Exit");
				choice = sc.nextInt();
			    try { switch (choice) {
				case 1:
					if (countEmp < limit) {
						System.out.println("Enter the Details: ");
						System.out.println("First Name ");
						String fn = sc.next();
						System.out.println("Last Name ");
						String sn = sc.next();
						System.out.println("Department ID ");
						int deptId = sc.nextInt();
						System.out.println("Basic Salary ");
						double bs = sc.nextDouble();
						emp[countEmp] = new Mgr(fn, sn, bs, deptId);
					    System.out.println("Enter the performance Bonus");
					    ((Mgr) emp[countEmp]).setPerfBonus(sc.nextDouble());
					
					    countEmp++;
					} else
						System.out.println("This organization is full");
					break;
				case 2:
					if (countEmp < limit) {
						System.out.println("Enter the Details: ");
						System.out.println("First Name ");
						String fn = sc.next();
						System.out.println("Last Name ");
						String sn = sc.next();
						System.out.println("Department ID ");
						int deptId = sc.nextInt();
						System.out.println("Basic Salary ");
						double bs = sc.nextDouble();
						emp[countEmp] = new Worker(fn, sn, bs, deptId);
						System.out.println("Enter the Hourly Rate of the Worker");
						((Worker)emp[countEmp]).setHourlyRate(sc.nextDouble());
						System.out.println("How many hours the worker has worked??");
						((Worker)emp[countEmp]).setHoursWorked(sc.nextInt());
					
                        countEmp++;
					} else
						System.out.println("This organization is full");
					break;
				case 3:
					for (Emp e : emp) {
						if(e!=null)
						System.out.println(e.toString() + " Net Salary-" + e.computeNetSalary());

					}
					break;  
				case 4:
					System.out.println("Enter the Employee ID and the Increment-");
					int id = sc.nextInt();
					double salInc = sc.nextDouble();
						System.out.println("Updated Basic Salary-" + emp[id].updateSalary(salInc));
					break;
				}

			
			}
		     catch(Exception e) {
					System.out.println("You have Entered a Wrong Input !!! ");

		}
		
		

	}while (choice != 10);

}
}
}
