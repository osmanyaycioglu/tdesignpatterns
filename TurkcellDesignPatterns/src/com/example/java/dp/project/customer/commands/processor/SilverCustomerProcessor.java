package com.example.java.dp.project.customer.commands.processor;

import com.example.java.dp.project.customer.commands.TLHesabiGor;
import com.example.java.dp.project.customer.commands.TLHesabindanParaCek;
import com.example.java.dp.project.customer.commands.TLHesabindanParaYatir;

public class SilverCustomerProcessor extends CustomerProcessor {

	public SilverCustomerProcessor() {
		this.getCommands().add(new TLHesabiGor());
		this.getCommands().add(new TLHesabindanParaCek());
		this.getCommands().add(new TLHesabindanParaYatir());
	}

}
