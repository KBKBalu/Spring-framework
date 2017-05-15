package balu.app;

public class Employee
{
private int empId;
private int empName;
private int empSal;
//adding Annotation
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public int getEmpName() {
	return empName;
}
public void setEmpName(int empName) {
	this.empName = empName;
}
public int getEmpSal() {
	return empSal;
}
public void setEmpSal(int empSal) {
	this.empSal = empSal;
}

}
