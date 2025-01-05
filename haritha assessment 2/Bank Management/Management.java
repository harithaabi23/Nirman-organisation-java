package bankManagement;

import java.util.Scanner;

public class Management {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bank bank = new Bank(1234567, 10000, "abi");
		System.out.println("Enter your pin number: ");
		long UserPin = sc.nextLong();
		sc.nextLine();
		long Pin = bank.getPin();
		int choice;
		boolean isTrue = true;
		while (isTrue) {
			if (Pin == UserPin) {

				System.out.println("choose an option:");
				System.out.println("1: To set the account details ");
				System.out.println("2: To deposit amount");
				System.out.println("3: To withdraw amount");
				System.out.println("4: To display account details");
				System.out.println("0 for exit");
				System.out.println(" ");
				System.out.println("Enter an option");
				choice = sc.nextInt();
				sc.nextLine();
				if (choice == 1) {

					System.out.println("Enter Account Number: ");
					long accountNo = sc.nextLong();
					sc.nextLine();

					System.out.println("Enter Account Holder Name: ");
					String name = sc.nextLine();

					System.out.println("Enter Account Balance: ");
					double balance = sc.nextDouble();
					sc.nextLine();

					bank = new Bank(accountNo, balance, name);
				}

				if (choice == 2) {

					System.out.println("Enter amount to be added");
					long amount = sc.nextLong();
					sc.nextLine();
					bank.setBalance(bank.getBalance() + amount);
				}
				 if (choice == 3) {
					System.out.println("Enter your pin number: ");
					//UserPin = sc.nextLong();
					long UserPin2 = sc.nextLong();
					Pin = bank.getPin();
					
					
					if (Pin == UserPin2) {
						System.out.println("Enter amount to be detucted");
						long dAmount = sc.nextLong();
						sc.nextLine();
						bank.setBalance(bank.getBalance() - dAmount);
					}
					else {
						System.out.println("Enter correct pin number");
					}
					
				}

				 if (choice == 4) {
					System.out.println(bank.toString());
				}
				 if(choice == 0) {
					isTrue = false;
					System.out.println("thank you");
				}

//				else {
//			System.out.println("Enter correct choice");
//				}
		}
				 else {
				System.out.println("Enter correct pin number");
				break;}
			}

		}
	}
