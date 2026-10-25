package com.kodewala.practice1;

public class CurrentAccount extends Account {
 private final long monthlyFee;
   CurrentAccount(String holder,long balance,long monthlyFee){
	   super(holder,balance);
	   if (monthlyFee <= 0) {
		    throw new IllegalArgumentException("Monthly fee must be positive");
		}
	   this.monthlyFee = monthlyFee;
   }
   public boolean chargeFee() {
	   withdraw(monthlyFee);
	   return true;
   }
   @Override
   public void showDetails(){
	   super.showDetails();
	   System.out.println("Monthly Fee : "+ monthlyFee);
   }
}
