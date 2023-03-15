package oopsday4.Inhertance.composition;

import java.util.Objects;

public class Employee extends Person{
	                   // is-a
	private long empId;
	private String deptNo;
	private double salary;
	private Address residenceAddress; // has-a
	private Address correspondenceAddress; //has-a
	
	public Employee() {
	}
	
	
	public Employee(String name, String gender, int age) {
		super(name, gender, age);
		// TODO Auto-generated constructor stub
	}


	public Employee(String name, String gender, int age,long empId, String deptNo, double salary, Address residenceAddress, Address correspondenceAddress) {
		super(name,gender,age);
		this.empId = empId;
		this.deptNo = deptNo;
		this.salary = salary;
		this.residenceAddress = residenceAddress;
		this.correspondenceAddress = correspondenceAddress;
	}

	
	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Address getResidenceAddress() {
		return residenceAddress;
	}

	public void setResidenceAddress(Address residenceAddress) {
		this.residenceAddress = residenceAddress;
	}

	public Address getCorrespondenceAddress() {
		return correspondenceAddress;
	}

	public void setCorrespondenceAddress(Address correspondenceAddress) {
		this.correspondenceAddress = correspondenceAddress;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", deptNo=" + deptNo + ", salary=" + salary + ", getName()=" + getName()
				+ ", getGender()=" + getGender() + ", getAge()=" + getAge() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(deptNo, empId, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(deptNo, other.deptNo) && empId == other.empId
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	 
/*
 * @Override public boolean equals(Object obj) { Employee ref = null; if(obj !=
 * null) ref = (Employee) obj; // down casting if( this.empId==ref.empId &&
 * this.getName().equals(ref.getName()) && this.deptNo == ref.deptNo) return
 * true; else return false;
 * 
 * 
 * }
 */
/*
 * @Override public int hashCode() {
 * 
 * int code = this.hashCode() * 32 * (int)this.empId * (this.getName().length())
 * * this.deptNo.length();
 * 
 * return super.hashCode(); }
 * 
 * 
 * 
 * }
 */
}
