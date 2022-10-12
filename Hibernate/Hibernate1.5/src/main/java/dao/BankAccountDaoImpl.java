package dao;

import static utils.HibernateUtils.getFactory;

import org.hibernate.Session;
import org.hibernate.Transaction;


import pojos.BankAccount;

import pojos.Vendor;

public class BankAccountDaoImpl implements IBankAccount {

	@Override
	public String addBankAccount(BankAccount bankAccount, int id) {
		String msg="bank account not added";
		// get session from SF
		String jpql = "select c from Student c where c.id =:id";
				Session session = getFactory().getCurrentSession();
				// begin tx
				Transaction tx = session.beginTransaction();
				try {
					Vendor vendor=session.createQuery(jpql, Vendor.class).setParameter("id",id)
					.getSingleResult();
					vendor.addAccount(bankAccount);
					msg="Account addedd done";
					tx.commit();// auto dity chking : DML : update on address tbl
				} catch (RuntimeException e) {
					if (tx != null)
						tx.rollback();
					throw e;
				}
				return msg;
	}

	

}
