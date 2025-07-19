package com.java.oops.inheritance;
class Account
{
    private String accNo;
    private String name;
    private String address;
    private String phno;
    private String dob;
    protected long balance;
    
    public Account(String acc,String n,String add,String phno,String dob)
    {
        accNo=acc;
        name=n;
        address=add;
        this.phno=phno;
        this.dob=dob;
        balance=10000;
    }
    public String getAccNo(){return accNo;}
    public String getName(){return name;}
    public String getAddress(){return address;};
    public String getPhno(){return phno;}
    public String getDOB(){return dob;}
    public long getBalance(){return balance;}
    
    public void setAddress(String add)
    {
        address=add;
    }
    public void setPhno(String phno)
    {
        this.phno=phno;
        System.out.println("New number is : "+phno);
    }
            
}

class SavingsAccount extends Account
{
    public SavingsAccount(String acc, String n, String add, String phno, String dob) {
		super(acc, n, add, phno, dob);
		// TODO Auto-generated constructor stub
	}
	public void deposit(long amt)
    {
        balance+=amt;
        System.out.println("Deposited money is : "+balance);
    }
    public void withdraw(long amt)
    {
        balance-=amt;
    }
}

class LoanAccount extends Account
{
    public LoanAccount(String acc, String n, String add, String phno, String dob) {
		super(acc, n, add, phno, dob);
		// TODO Auto-generated constructor stub
	}
	public void payEMI(long amt)
    {
        balance-=amt;
        System.out.println("Balance is : "+balance);
    }
    public void repay(long amt)
    {
        if(balance==amt)
            balance=0;
    }
}

public class Inheritance 
{
    public static void main(String[] args) 
    {
    	LoanAccount a = new LoanAccount("A123", "B123", "123", "1234567890", "19052000");
    	a.payEMI(5000);
    	a.setPhno("9182779845");
    	Account b= new LoanAccount("C123", "D123", "123", "1234567890", "19052000");
        //((SavingsAccount) b).deposit(5000);
    	
    }   
}