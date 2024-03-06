package dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee 
{
	@Id
	private int emp_id;
	private String emp_name;
	private String emp_addrss;
	private long emp_phNo;
	private String emp_emailId;
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
	public String getEmp_addrss() {
		return emp_addrss;
	}
	public void setEmp_addrss(String emp_addrss) {
		this.emp_addrss = emp_addrss;
	}
	public long getEmp_phNo() {
		return emp_phNo;
	}
	public void setEmp_phNo(long emp_phNo) {
		this.emp_phNo = emp_phNo;
	}
	public String getEmp_emailId() {
		return emp_emailId;
	}
	public void setEmp_emailId(String emp_emailId) {
		this.emp_emailId = emp_emailId;
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_addrss=" + emp_addrss + ", emp_phNo="
				+ emp_phNo + ", emp_emailId=" + emp_emailId + "]";
	}
	
}
