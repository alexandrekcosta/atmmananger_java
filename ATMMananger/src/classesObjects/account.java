package classesObjects;

public class account {
	private String name;
	private int pin;
	private int BranchPin;
	private double ballance;
	
	public account(String name, int pin, int branchPin, float ballance) {
		this.name = name;
		this.pin = pin;
		BranchPin = branchPin;
		this.ballance = ballance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public int getBranchPin() {
		return BranchPin;
	}

	public void setBranchPin(int branchPin) {
		BranchPin = branchPin;
	}

	public double getBallance() {
		return ballance;
	}
	
	public void deposit(double value) {
		
		ballance = ballance + value;
		
	}
	
	public void withdraw(double value) {
		
		ballance = ballance - value;
		
	}
	
	public void showAccount() {
		
		System.out.println("::::::::::ATM MANANGER 1.0:::::::::::");
		System.out.println(" ");
		System.out.println("=ACCOUNT INFO=");
		System.out.println("ACCOUNT HOLDER: "+name);
		System.out.println("ACCOUNT PIN: "+pin);
		System.out.println("ACCOUNT BRANCH PIN: "+BranchPin);
		System.out.println("ACCOUNT BALLANCE: "+ballance);
		System.out.println("======================================");
		System.out.println(" ");
		
	}
	
	

}
