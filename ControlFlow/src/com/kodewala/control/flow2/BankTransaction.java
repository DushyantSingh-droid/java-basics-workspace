package com.kodewala.control.flow2;

public class BankTransaction {
	public int processTransaction(String transactionType, int balance, int amount) {
		if (balance < 0 || amount <= 0) {
			return -1;
		}
		switch (transactionType) {

		case "Deposit":
			balance = balance + amount;
			if (balance > 100000) {
				return -2;
			}
			break;
		case "Withdraw":
			if (amount > balance) {
				return -3;
			}
			balance = balance - amount;
			break;
		case "Transfer":
			int totalDeduction = amount + 50;
			if (totalDeduction > balance) {
				return -3;
			} else {
				balance = balance - totalDeduction;
			}
			break;
		case "Check":
			System.out.println("balance " + balance);
			return balance;
		default:
			return -4;
		}
		System.out.println("balance " + balance);
		return balance;
	}

	public static void main(String args[]) {
		BankTransaction t1 = new BankTransaction();
		String type = args[0];
		int balance = Integer.parseInt(args[1]);
		int amount = Integer.parseInt(args[2]);
		t1.processTransaction(type, balance, amount);
	}
}