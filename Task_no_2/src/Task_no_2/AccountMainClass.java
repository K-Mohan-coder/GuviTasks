package Task_no_2;

public class AccountMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	System.out.println("1.3");

    	System.out.println("Without Argument");
    	
		Account a1 = new Account();
    	System.out.println("Deposite");
    	a1.depositFunc(1000);
    	a1.display();
    	System.out.println("Withdraw");
    	a1.withdraw(500);
    	a1.display();
    	
    	
    	System.out.println();

    	System.out.println("With Argument");
    	
		Account a2 = new Account(1000);
		
    	System.out.println("Deposite");
    	a2.depositFunc(1000);
    	a2.display();
    	System.out.println("Withdraw");
    	a2.withdraw(500);
    	a2.display();
    	
    	
	}

}
