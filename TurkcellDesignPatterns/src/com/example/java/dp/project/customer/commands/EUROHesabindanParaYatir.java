package com.example.java.dp.project.customer.commands;

import java.util.Scanner;

import com.example.java.dp.project.customer.Customer;
import com.example.java.dp.project.customer.EAccountType;

public class EUROHesabindanParaYatir extends AbstractCommand {

	@Override
	public String getMenuDesc() {
		return "EURO Hesabýndan para yatir";
	}

	@Override
	public void execute(final Scanner scanner, final Customer customer) {
		this.hesapYatirimi(scanner,
		                   customer,
		                   EAccountType.EURO);
	}

}
