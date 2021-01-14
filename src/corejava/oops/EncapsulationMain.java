package corejava.oops;

class Employee{
	
	private int emp_id;
	private String emp_name;
	private int emp_age;
	
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public int getEmp_age() {
		return emp_age;
	}
	public void setEmp_age(int emp_age) {
		this.emp_age = emp_age;
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_age=" + emp_age + "]";
	}
	
	
}
public class EncapsulationMain {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEmp_id(1);
		emp.setEmp_name("Kousik");
		emp.setEmp_age(23);
		System.out.println(emp);
	}
}
