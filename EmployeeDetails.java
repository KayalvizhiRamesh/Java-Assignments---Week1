package week1.day2.assignments;

public class EmployeeDetails {
	
	public static void main(String[] args) {
		EmployeeDetails emp = new EmployeeDetails();
		emp.printEmployeeName("Kayal", 12345);
		emp.getEmployeeAddress ("Chennai");
		emp.printEmployeeSalary(10000);
		emp.printEmployeeMobileNumber (6548991255L);
	}
	
	public void printEmployeeName(String empName, int empId)
	{
		System.out.println("Emp Name : " + empName);
		System.out.println("Emp Id : " +empId);
	}
	
	public void getEmployeeAddress(String empAddress)
	{
		System.out.println("Emp Address : " +empAddress);
	}
	
	public void printEmployeeSalary(double empSalary)
	{
		System.out.println("Emp Salary : " +empSalary);
	}
	
	public void printEmployeeMobileNumber(long mobNum)
	{
		System.out.println("Emp contact : " +mobNum);
	}
	
}
