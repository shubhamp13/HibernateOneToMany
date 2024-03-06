package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import dao.CompanyDao;
import dao.EmployeeDao;
import dto.Company;
import dto.Employee;

public class EmployeeCompany 
{
	public static void main(String[] args) 
	{
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.println("Enter Your Choice");
			System.out.println("1.Save The Company Details");
			System.out.println("2. Save The Employee details");
			System.out.println("3.Update Company Details");
			System.out.println("4.Update Employee Details");
			System.out.println("5.Fetch Company Details");
			System.out.println("6.Fetch Employee Details");
			System.out.println("7.Delete The Company Details");
			System.out.println("8. Delete The Employee Details");
			int choice=Integer.parseInt(bufferedReader.readLine());
			Company company=new Company();
			Employee employee=new Employee();
			CompanyDao companyDao=new CompanyDao();
			EmployeeDao employeeDao=new EmployeeDao();	
			switch(choice)
			{
			case 1:
				{
					System.out.println("Enter Company Name");
					String companyName=bufferedReader.readLine();
					System.out.println("Enter Company Id");
					int companyId=Integer.parseInt(bufferedReader.readLine());
					System.out.println("Enter Company Domain");
					String companyDomain=bufferedReader.readLine();
					company.setCompanyId(companyId);
					company.setCompanyDomain(companyDomain);
					company.setCompanyName(companyName);
					companyDao.saveCompany(company);
					System.out.println("Company Details saved Successfully");
				}
				break;
			case 2:
				{
					System.out.println("Enter Employee Name");
					String empName=bufferedReader.readLine();
					System.out.println("Enter EMployee Id");
					int empId=Integer.parseInt(bufferedReader.readLine());
					System.out.println("Enter Employee Contact No");
					long phNo=Long.parseLong(bufferedReader.readLine());
					System.out.println("Enter Email Id");
					String emailId=bufferedReader.readLine();
					System.out.println("Enter Employee Address");
					String empAddress=bufferedReader.readLine();
					System.out.println("Enter Company Id To Save Employee Details");
					int companyId=Integer.parseInt(bufferedReader.readLine());
					employee.setEmp_addrss(empAddress);
					employee.setEmp_emailId(emailId);
					employee.setEmp_id(empId);
					employee.setEmp_name(empName);
					employee.setEmp_phNo(phNo);
					employeeDao.saveEmployee(companyId, employee);
					System.out.println("Employee Details Saved");					
				}
				break;
			case 3:
				{
					System.out.println("Enter Company Id to be updated");
					int companyId=Integer.parseInt(bufferedReader.readLine());
					System.out.println("Enter Company Name To be Updated");
					String companyName=bufferedReader.readLine();
					System.out.println("Enter Company Domain To Be Updated");
					String companyDomain=bufferedReader.readLine();
					company.setCompanyDomain(companyDomain);
					company.setCompanyName(companyName);
					companyDao.updateCompany(companyId, company);
				}
				break;
			case 4:
				{
					System.out.println("Enter EMployee Id To Update The Details");
					int empId=Integer.parseInt(bufferedReader.readLine());
					System.out.println("Enter Employee Name");
					String empName=bufferedReader.readLine();
					System.out.println("Enter Employee Contact No");
					long phNo=Long.parseLong(bufferedReader.readLine());
					System.out.println("Enter Email Id");
					String emailId=bufferedReader.readLine();
					System.out.println("Enter Employee Address");
					String empAddress=bufferedReader.readLine();
					employee.setEmp_addrss(empAddress);
					employee.setEmp_emailId(emailId);
					employee.setEmp_name(empName);
					employee.setEmp_phNo(phNo);
					employeeDao.updateEmployee(empId, employee);
					System.out.println("Employee Details Saved");					
				}
				break;
			case 5:
				{
					System.out.println("Enter Company Id To Be Display");
					int companyId=Integer.parseInt(bufferedReader.readLine());
					 companyDao.findCompany(companyId);
				}
				break;
			case 6:
			{
				System.out.println("Enter Employee Id To Be Display");
				int employeeId=Integer.parseInt(bufferedReader.readLine());
				employeeDao.findEmployee(employeeId);
			}
			break;
			case 7:
			{
				System.out.println("Enter Company Id To Be Deleted");
				int companyId=Integer.parseInt(bufferedReader.readLine());
				 companyDao.deleteCompany(companyId);
			}
			break;
		case 8:
		{
			System.out.println("Enter Employee Id To Be Deleted");
			int employeeId=Integer.parseInt(bufferedReader.readLine());
			employeeDao.deleteEmployee(employeeId);
		}
		break;
				
				
		 }
			
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
