package com.example.java.dp.project.customer.commands;

import java.util.Scanner;

import com.example.java.dp.project.customer.Customer;

public interface ICommand {
	public String getMenuDesc();

	public void execute(Scanner scanner, Customer customer);

}
