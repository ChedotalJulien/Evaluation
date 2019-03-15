package co.simplon.dao;

import TestDao.TestDaoCounts;
import TestDao.TestDaoCustomers;

public class Test {
	
	public static void main(String[] args) {
		TestDaoCustomers.lancerTests();
		System.out.println("\n\n");
		TestDaoCounts.lancerTests();		
	}
}
