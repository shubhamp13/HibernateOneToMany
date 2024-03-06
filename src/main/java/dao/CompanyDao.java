package dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import dto.Company;

public class CompanyDao 
{
	public EntityManager getEntityManager()
	{
		return Persistence.createEntityManagerFactory("persistence").createEntityManager();
	}
	public void saveCompany(Company company)
	{
		EntityManager entityManager=getEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(company);
		entityManager.getTransaction().commit();
	}
	public void updateCompany(int companyId,Company company)
	{
		EntityManager entityManager=getEntityManager();
		Company dbCompany=entityManager.find(Company.class,companyId);
		if(dbCompany!=null)
		{
			entityManager.getTransaction().begin();
			company.setCompanyId(companyId);
			entityManager.merge(company);
			entityManager.getTransaction().commit();
		}
		else
		{
			System.out.println("Iinvalid Company Ids");
		}
	}
	public void findCompany(int companyId)
	{
		EntityManager entityManager=getEntityManager();
		Company dbCompany=entityManager.find(Company.class, companyId);
		if(dbCompany!=null)
		{
			System.out.println(dbCompany);
		}
		else
		{
			System.out.println("Invalid Company Details");
		}
	}
	public void deleteCompany(int companyId)
	{
		EntityManager entityManager=getEntityManager();
		Company dbCompany=entityManager.find(Company.class, companyId);
		if(dbCompany!=null)
		{
			entityManager.getTransaction().begin();
			entityManager.remove(dbCompany);
			entityManager.getTransaction().commit();
		}
		else
		{
			System.out.println("Invalid Company Details");
		}
	}
}
