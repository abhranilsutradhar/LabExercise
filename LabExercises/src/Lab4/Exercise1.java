package Lab4;

import java.util.*;
import java.util.Random; 

class Account{
	long accNum;
	double balance;
	Person accHolder;
	
	Account(){
		
	}
	
	
	public Person getAccHolder() {
		return accHolder;
	}


	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}


	public long getAccNum() {
		return accNum;
	}

	public void setAccNum() {
	    this.accNum=accNum;
	}

	void setBalance(double balance) {
		this.balance = balance;
	}

	double getBalance() {
		return this.balance;
	}

	void deposit(double balance) {
		this.balance = this.balance + balance;
	}

	void withdraw(double balance) {
		this.balance = this.balance - balance;
	}

}

class Person{
	String name;
	float age;
	
	Person(String name,float age){
		this.name=name;
		this.age=age;
	}
}

class SavingsAccount extends Account{
	final double minimumBalance = 500.00;
	Account a;

	SavingsAccount(Account a) {
		super.accNum = a.accNum;
		super.balance = a.balance;
		super.accHolder = a.accHolder;
	}

	@Override
	void withdraw(double balance) {
		if (super.balance - balance >= this.minimumBalance)
			super.balance = super.balance - balance;
	}
}

class CurrentAccount extends Account {
	double overdraftLimit;

	@Override
	void withdraw(double balance) {
		if (balance <= overdraftLimit) {
			super.balance = super.balance - balance;
			System.out.println(true);
		}
		System.out.println(false);
	}
}

public class Exercise1 {
	public static void main(String args[]) {
		Person smith = new Person("Smith",25);
		Account sac = new Account();
		sac.setAccHolder(smith);
		sac.setAccNum();
		sac.setBalance(2000);
		sac.deposit(2000);
		System.out.println("Smith: "+sac.getBalance());
		
		Person Kathy=new Person("Kathy",29);
		Account kac=new Account();
		kac.setAccHolder(Kathy);
		kac.setAccNum();
		kac.setBalance(3000);
		kac.withdraw(2000);
		System.out.println("Kathy: "+kac.getBalance());
		
	}
}