package userdefinedobject;

import java.util.Objects;

public class Employee extends Person implements Comparable{
	
	private long empId;
	private String deptNo;
	private double salary;
	public Employee() {
	}
	public Employee(String name, String gender, int age,long empId,String deptno,double salary) {
		super(name, gender, age);
		this.empId =empId;
		this.deptNo = deptno;
		this.salary = salary;
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
	@Override
	public int compareTo(Object o) {
		Employee ref = null;
		if(o!=null) {
			ref = (Employee) o;
		}
		if(this.empId<ref.getEmpId())
			return -1;//acending order
		              //decending order
		else if(this.empId > ref.getEmpId())
			return 1;
		else
		  return 0;
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
