package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import dto.Company;
import dto.Employee;

public class EmployeeDao 
{
	public EntityManager getEntityManager()
	{
		return Persistence.createEntityManagerFactory("persistence").createEntityManager();
	}
	public void saveEmployee(int companyId,Employee employee)
	{
		EntityManager entityManager=getEntityManager();
		Company dbCompany=entityManager.find(Company.class,companyId);
		if(dbCompany!=null)
		{
			entityManager.getTransaction().begin();
			List<Employee> employees=dbCompany.getEmployees();
			entityManager.persist(employee);
			employees.add(employee);
			dbCompany.setEmployees(employees);
			entityManager.getTransaction().commit();
		}
		else
		{
			System.out.println("Invalid Company Code");
		}
	}
	public void updateEmployee(int empId,Employee employee)
	{
		EntityManager entityManager=getEntityManager();
		Employee dbEmployee=entityManager.find(Employee.class, empId);
		if(dbEmployee!=null)
		{
			entityManager.getTransaction().begin();
			employee.setEmp_id(empId);
			entityManager.merge(employee);
			entityManager.getTransaction().commit();
		}
		else
		{
			System.out.println("Invalid Emp id");
		}
	}
	public void deleteEmployee(int empId)
	{
		EntityManager entityManager=getEntityManager();
		Employee dbEmployee=entityManager.find(Employee.class, empId);
		if(dbEmployee!=null)
		{
			entityManager.getTransaction().begin();
			entityManager.remove(dbEmployee);
			entityManager.getTransaction().commit();
		}
		else
		{
			System.out.println("Invalid Employee Id");
		}
	}
	public void findEmployee(int empId)
	{
		EntityManager entityManager=getEntityManager();
		Employee dbEmployee=entityManager.find(Employee.class, empId);
		if(dbEmployee!=null)
		{ 
			System.out.println(dbEmployee);
		}
		else
		{
			System.out.println("Invalid Employee Id");
		}
	}
}
