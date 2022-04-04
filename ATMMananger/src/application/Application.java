//Use this class for using following commands those displayed on example bellow
//to set account infos.

package application;

import java.util.Scanner;

import classesObjects.account;

public class Application {

	public static void main(String[] args) {
		
		account a1 = new account(null, 0, 0, 0);
		
		a1.setName("Alexandre Costa");
		a1.setPin(1234567);
		a1.setBranchPin(8197);
		a1.deposit(1000);
		a1.withdraw(100);
		a1.showAccount(); 
		
		account a2 = new account(null, 0, 0, 0);
		
		a2.setName("Roshni Prasad");
		a2.setPin(41424678);
		a2.setBranchPin(7777);
		a2.deposit(10000.10);
		a2.withdraw(2551.25);
		a2.showAccount();

	}

}
