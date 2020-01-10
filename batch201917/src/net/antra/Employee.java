package net.antra;

public class Employee{
	
	private int empId;
	
	public Employee(int empId){
		this.empId=empId;
		
	}
	public int getEmpId() {
		return empId;
	}
	
	public void setEmpId(int id) {
		empId=id;
	}
	
	public boolean equals(Object obj) {
		Employee emp=(Employee)obj;
		if(this.empId==emp.empId) {
			return true;
		}else {
			return false;
		}
		
		
	}
	
	/*public int hashCode() {
		return 1;
	}*/
	/*@Override
	public String toString() {
		
		return getClass().getName()+"@"+Integer.toHexString(hashCode());
	}*/
	
	
	/*{
		System.out.println("in instace block");
	}
	public Employee(int empId){
		this.empId=empId;
		System.out.println("in parameterized constructor");
	}*/
	
	/*public Employee() {
		System.out.println("in default constructor");
	}*/
	
	
	
	
	

}
