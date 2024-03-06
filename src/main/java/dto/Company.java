package dto;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Company 
{
	@Id
	private int companyId;
	private String companyName;
	private String companyDomain;
	@OneToMany
	private List<Employee>employees;
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyDomain() {
		return companyDomain;
	}
	public void setCompanyDomain(String companyDomain) {
		this.companyDomain = companyDomain;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyName=" + companyName + ", companyDomain=" + companyDomain
				+ ", employees=" + employees + "]";
	}	
}
