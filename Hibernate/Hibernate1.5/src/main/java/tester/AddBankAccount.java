package tester;

import static utils.HibernateUtils.getFactory;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.BankAccountDaoImpl;
import pojos.AccType;
import pojos.BankAccount;



public class AddBankAccount {

	public static void main(String[] args) {
		
		try(SessionFactory sf=getFactory();Scanner sc=new Scanner(System.in))
		{
			BankAccountDaoImpl bankDao=new BankAccountDaoImpl();
			System.out.println("Enter a bank detail of vendor to add :");
			System.out.println("Enter --type-- balence-- transactionDate");
		//AccType.valueOf(sc.next()),sc.nextDouble(),LocalDate.parse(sc.next()))
			BankAccount bankAcc=new BankAccount();
			bankAcc.setType(AccType.valueOf(sc.next()));
			bankAcc.setBalence(sc.nextDouble());
		 // bankAcc.setTransactionDate(Date.parse(sc.next()));
			System.out.println("Enter a Vendor ID ---");
			bankDao.addBankAccount(bankAcc,sc.nextInt());
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
