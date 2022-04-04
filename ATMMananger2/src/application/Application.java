package application;

import java.util.Scanner;

import classes.Account;

public class Application {

	public static void main(String[] args) {
		
		double ballance = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println(":::::::::::ATM MANANGER 2.0:::::::::::::");
		System.out.println(" ");
		System.out.print("Set holder's name: ");
		String name = input.nextLine();
		System.out.println(" ");
		System.out.print("Set PIN: ");
		int pin = input.nextInt();
		System.out.print("Set branch PIN: ");
		int branchPin = input.nextInt();
		System.out.println(" ");
		
		Account a1 = new Account(name, branchPin, branchPin, branchPin);
		
		System.out.print("Options to choose: 1 - deposit,  2 - withdraw: ");
		char o = input.next().charAt(0);
		System.out.println(" ");
		
		if(o == '1') {
			
			System.out.print("Enter amount to deposit: ");
			double ad = input.nextDouble();
			
			double dr = ballance + ad;
			
			a1.deposit(ad);
		}
		else if(o == '2') {
			
			System.out.print("Enter amount to withdraw: ");
			double aw = input.nextDouble();
			
			double wr = ballance + aw;
			
			a1.withdraw(wr);
			
			
		}
		
		a1.showAccount();
		
	}

}
