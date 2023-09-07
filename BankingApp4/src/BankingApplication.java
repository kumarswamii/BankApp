import java.util.Scanner;

public class BankingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Account acc=new Account();
         acc.showMenu();
	}

}


class Account{
	int balance;
	int previousTransaction;
	String Name;
	
	
	void deposit(int amt) {
		if(amt!=0) {
			balance=balance+amt;
			previousTransaction=amt;
		}
	}
	void withdraw(int amt) {
		if(amt!=0) {
			balance=balance-amt;
			previousTransaction= -amt;
		}
	}
	void getPreviousTransaction() {
		if(previousTransaction>0) {
			System.out.println("Deposited:"+previousTransaction);
		}
		else if(previousTransaction<0) {
			System.out.println("Withdraw:"+Math.abs(previousTransaction));
		}
		else {
			System.out.println("No Transaction Ocurred");
		}
	}
	
	void showMenu() {
		char option='\0';
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome");
		System.out.println("\n");
		
		System.out.println("A: Check Your Balance");
		System.out.println("B: Deposit");
		System.out.println("C: Withdraw");
		System.out.println("D: Previous Transaction");
		System.out.println("E: Exit");
		
		
		do {
			System.out.println("************---------------------*****************");
			System.out.println("Enter Your Option");
			System.out.println("************---------------------*****************");
			option=sc.next().charAt(0);
			System.out.println("\n");
			
			switch(option) {
			case 'A':
				System.out.println("******************************************************");
				System.out.println("Balance:"+balance);
				System.out.println("******************************************************");
				System.out.println("\n");
				break;
			case 'B':
				System.out.println("******************************************************");
				System.out.println("Enter an amount to deposit:");
				System.out.println("******************************************************");
				
				int amt=sc.nextInt();
				deposit(amt);
				System.out.println("\n");
				break;
			case 'C':
				System.out.println("******************************************************");
				System.out.println("Enter an amount to withdraw:");
				System.out.println("******************************************************");
				
				int amt2=sc.nextInt();
				withdraw(amt2);
				System.out.println("\n");
				break;
			
			case 'D':
				System.out.println("******************************************************");
				getPreviousTransaction();
				System.out.println("******************************************************");
				System.out.println("\n");
				break;
			case 'E':
				System.out.println("******************************************************");
				break;
			default:
				System.out.println("Invalid option....");
				break;
			}
			
		}
		while(option !='E');
		   System.out.println("Thank You for using Our Bank Application....");
		
	}
}
