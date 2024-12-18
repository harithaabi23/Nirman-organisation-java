package bankManagement;

public class Bank {
	private long accountNo;
	private double balance;
	private String name;
	private final long pin = 2331;
	
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPin() {
		return pin;
	}
	@Override
	public String toString() {
		return "Bank [accountNo=" + accountNo + ", balance=" + balance + ", name=" + name + "]";
	}
	public Bank(long accountNo, double balance, String name) {
		//super();
		this.accountNo = accountNo;
		this.balance = balance;
		this.name = name;
	}
	public Bank() {
		super();
	}
	
	
}
