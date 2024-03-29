package com.example.java.dp.project.customer.commands;

import java.util.Scanner;

import com.example.java.dp.project.customer.Customer;
import com.example.java.dp.project.customer.EAccountType;

public class TLHesabindanParaCek extends AbstractCommand {

	@Override
	public String getMenuDesc() {
		return "TL Hesab�ndan para �ek";
	}

	@Override
	public void execute(final Scanner scanner, final Customer customer) {
		this.hesapCekimi(scanner,
		                 customer,
		                 EAccountType.TL);
	}

}
