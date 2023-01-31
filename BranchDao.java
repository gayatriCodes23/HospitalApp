package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Branch;
import dto.Hospital;


public class BranchDao {
	static EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
	static EntityManager entityManager = factory.createEntityManager();
	static EntityTransaction transaction = entityManager.getTransaction();

	public static void saveBranch(int id, Branch branch) {

		Hospital hospital = HospitalDao.getHospitalById(id);
		if (hospital != null) {
			transaction.begin();
			branch.setHospital(hospital);
			entityManager.persist(branch);
			transaction.commit();
		} else {
			System.out.println("Hospital does not exist");
		}

	}
}
