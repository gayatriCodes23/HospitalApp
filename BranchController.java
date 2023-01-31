package controller;

import dao.BranchDao;
import dto.Address;
import dto.Branch;

public class InsertBranch {
	
	
	public static void main(String[] args) {
		Address a = new Address();
		a.setLocation("Banaswadi");
		
		Branch b = new Branch();
		b.setName("Manipal Banaswadi");
		b.setEmail_id("manipalban@gmail.com");
		b.setAddress(a);
		
		BranchDao.saveBranch(1, b);
	}
}
