package Task_no_2;

import java.util.*;

public class Account {

	int account;
	
	Account(){
	this.account=0;

	}
	
	Account(int account){
		this.account=account;
	}
	
	public void depositFunc(int deposit) {
		
		account+=deposit;
	}
	
	public void withdraw(int withdraw) {
		
		account-=withdraw;
	}
	
	public void display() {
    	System.out.println("Your Balance : "+account);
	}
	
	
}
