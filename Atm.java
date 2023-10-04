import java.util.Scanner;

public class Atm {
	double amt;
	private double BALANCE=2000.00;
	  private int PIN=4567;
	  Scanner sc=new Scanner(System.in);
	
	public Atm() {
		System.out.println("WELCOME TO THE ATM PLEASE ENTER YOUR 4 DIGIT PIN");
		int checkpin=sc.nextInt();
		if(PIN!=checkpin) {
			 System.out.println("PIN IS INCORRECT ....collect your card and try again");
			 System.exit(0);
		}
	}
	   public void checkBalance() {
			
				System.out.println("Balance= "+BALANCE);
				System.out.println("Thanks for visiting!");
			 }
	   
	   
			public void withdraw() {
			System.out.println("Enter the amount to withdraw");
			amt=sc.nextDouble();
			if(amt>BALANCE) {
			System.out.println("Insufficient Balance");
		}else {
			System.out.println("Balance "+(BALANCE-=amt));
			System.out.println("Thanks for visiting!");
		}
			}
			
			
			public void deposit() {
			System.out.println("Enter the amount to deposit");
			amt=sc.nextDouble();
			if(amt<100) {
			System.out.println("Please enter more than 100");
		}else {
			System.out.println("Balance "+(BALANCE+=amt));
			System.out.println("Thanks for visiting!");
		}
			}
		
			
			
			
	 public static void main(String[] args) {
		 Atm a=new Atm();
		 Scanner sc=new Scanner(System.in);
		
			while(true) {
				
			System.out.println("1.Check Balance\n2.Withdraw\n3.Deposit\n4.Quit");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				a.checkBalance();
			    break;
			case 2:
				a.withdraw();
				break;
			case 3:
				a.deposit();
				break;
			case 4:
				System.out.println("thanks for visiting!!!");
				System.exit(0);;
				
				default:
					System.out.println("enter a valid number");
			
		}
			}
		}
	 
}
			



		

	


	

