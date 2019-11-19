package com.example.java.dp.project.customer.commands;

import java.util.Scanner;

import com.example.java.dp.project.customer.Account;
import com.example.java.dp.project.customer.Customer;
import com.example.java.dp.project.customer.EAccountType;

public abstract class AbstractCommand implements ICommand {

	void hesapCekimi(final Scanner scanner, final Customer customer, final EAccountType accountType) {
		Account account = customer.getAccount(accountType);
		if (account == null) {
			System.out.println(accountType + " Hesab�n�z yok. Bankaya dan���n");
		}
		System.out.println(account);
		System.out.println("�ekece�iniz miktar : ");
		double nextDouble = scanner.nextDouble();
		account.setAmount(account.getAmount() - nextDouble);
	}

	void hesapYatirimi(final Scanner scanner, final Customer customer, final EAccountType accountType) {
		Account account = customer.getAccount(accountType);
		if (account == null) {
			System.out.println(accountType + " Hesab�n�z yok. Bankaya dan���n");
		}
		System.out.println(account);
		System.out.println("Yatiraca��n�z miktar : ");
		double nextDouble = scanner.nextDouble();
		account.setAmount(account.getAmount() + nextDouble);
	}

}
